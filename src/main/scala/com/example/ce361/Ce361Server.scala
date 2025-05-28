package com.example.ce361

import scala.concurrent.duration.*

import cats.effect.Async
import cats.effect.kernel.Resource
import cats.syntax.all.*
import com.comcast.ip4s.*
import fs2.io.net.Network
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.implicits.*
import org.http4s.server.middleware.Logger

object Ce361Server {

  def run[F[_]: Async: Network]: Resource[F, Unit] = {
    for {
      client <- EmberClientBuilder.default[F].build
      helloWorldAlg = HelloWorld.impl[F]
      jokeAlg = Jokes.impl[F](client)

      // Combine Service Routes into an HttpApp.
      // Can also be done via a Router if you
      // want to extract segments not checked
      // in the underlying routes.
      httpApp = (
        Ce361Routes.helloWorldRoutes[F](helloWorldAlg) <+>
        Ce361Routes.jokeRoutes[F](jokeAlg)
      ).orNotFound

      // With Middlewares in place
      finalHttpApp = Logger.httpApp(true, true)(httpApp)

      _ <-
        EmberServerBuilder.default[F]
          .withHost(ipv4"0.0.0.0")
          .withPort(port"8071")
          .withHttpApp(finalHttpApp)
          .withShutdownTimeout(0.millis)
          .build
    } yield ()
  }
}
