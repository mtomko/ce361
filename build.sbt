import org.typelevel.scalacoptions.ScalacOptions

val CatsEffectVersion = "3.6.1"
val Fs2Version = "3.12.0"
val Http4sVersion = "0.23.30"
val CirceVersion = "0.14.13"
val MunitVersion = "1.1.0"
val LogbackVersion = "1.5.18"
val MunitCatsEffectVersion = "2.1.0"
val Scala2Version = "2.13.16"

inThisBuild(
  List(
    scalaVersion := Scala2Version,
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision
  )
)

lazy val root = (project in file("."))
  .settings(
    organization := "com.example",
    name := "ce361",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := Scala2Version,
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-core" % Fs2Version,
      "co.fs2" %% "fs2-io" % Fs2Version,
      "org.http4s" %% "http4s-ember-server" % Http4sVersion,
      "org.http4s" %% "http4s-ember-client" % Http4sVersion,
      "org.http4s" %% "http4s-circe" % Http4sVersion,
      "org.http4s" %% "http4s-dsl" % Http4sVersion,
      "io.circe" %% "circe-generic" % CirceVersion,
      "org.typelevel" %% "cats-effect" % CatsEffectVersion,
      "org.scalameta" %% "munit" % MunitVersion % Test,
      "org.typelevel" %% "munit-cats-effect" % MunitCatsEffectVersion % Test,
      "ch.qos.logback" % "logback-classic" % LogbackVersion % Runtime
    ),
    addCompilerPlugin(
      "org.typelevel" %% "kind-projector" % "0.13.3" cross CrossVersion.full
    ),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
    scalacOptions ++= Seq("-Xsource:3")
  )
