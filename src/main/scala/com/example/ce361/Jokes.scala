package com.example.ce361

import cats.effect.Concurrent
import cats.implicits.*
import io.circe.generic.semiauto.*
import io.circe.{Decoder, Encoder}
import org.http4s.*
import org.http4s.Method.*
import org.http4s.circe.*
import org.http4s.client.Client
import org.http4s.client.dsl.Http4sClientDsl
import org.http4s.implicits.*

trait Jokes[F[_]] {
  def get: F[Jokes.Joke]
}

object Jokes {
  def apply[F[_]](implicit ev: Jokes[F]): Jokes[F] = ev

  final case class Joke(joke: String) extends AnyVal
  object Joke {
    implicit val jokeDecoder: Decoder[Joke] = deriveDecoder[Joke]
    implicit def jokeEntityDecoder[F[_]: Concurrent]: EntityDecoder[F, Joke] = jsonOf
    implicit val jokeEncoder: Encoder[Joke] = deriveEncoder[Joke]
    implicit def jokeEntityEncoder[F[_]]: EntityEncoder[F, Joke] = jsonEncoderOf
  }

  final case class JokeError(e: Throwable) extends RuntimeException

  def impl[F[_]: Concurrent](C: Client[F]): Jokes[F] = new Jokes[F] {
    val dsl = new Http4sClientDsl[F] {}
    import dsl.*
    def get: F[Jokes.Joke] = {
      C.expect[Joke](GET(uri"https://icanhazdadjoke.com/"))
        .adaptError { case t =>
          JokeError(t)
        } // Prevent Client Json Decoding Failure Leaking
    }
  }
}
