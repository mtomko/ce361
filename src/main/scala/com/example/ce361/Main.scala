package com.example.ce361

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  val run: IO[Unit] = Ce361Server.run[IO].useForever.void
}
