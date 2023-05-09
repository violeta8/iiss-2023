import sbt._

name := "terminal"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.6.16",
  "com.typesafe.akka" %% "akka-actor" % "2.6.16",
  "io.reactivex" %% "rxscala" % "0.26.5"
)

