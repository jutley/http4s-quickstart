organization := "io.jutley"
name := "http4s-quickstart"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blaze-server" % "0.15.7a",
  "org.http4s" %% "http4s-dsl"          % "0.15.7a",
  "org.http4s" %% "http4s-circe"        % "0.15.7a"
)

val circeVersion = "0.7.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-java8",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-generic-extras",
  "io.circe" %% "circe-literal"
).map(_ % circeVersion)

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.4"
