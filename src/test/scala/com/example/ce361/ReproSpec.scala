package com.example.ce361

import cats.effect.IO
import cats.syntax.all.*
import munit.CatsEffectSuite
import org.http4s.*
import org.http4s.EntityDecoder.text
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.implicits.*

class ReproSpec extends CatsEffectSuite {

  implicit private def responseEntityDecoder: EntityDecoder[IO, String] = text[IO]

  test("shutdown") {
    EmberClientBuilder.default[IO].build.use { client =>
      0.to(1000).toList.traverse_ { _ =>
        Ce361Server.run[IO].surround {
          client.expect[String](uri"http://localhost:8071/hello/world")
        }
      }
    }
  }

  test("shutdown 2") {
    EmberClientBuilder.default[IO].build.use { client =>
      0.to(10).toList.traverse_ { _ =>
        Ce361Server.run[IO].surround {
          client
            .expect[String](uri"http://localhost:8071/joke")
            .flatTap(IO.println)
        }
      }
    }
  }

}
