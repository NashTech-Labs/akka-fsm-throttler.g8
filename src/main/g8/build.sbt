name := "akka-fsm"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(

  //log4j
  "log4j" % "log4j" % "1.2.17",

  //akka
  "com.typesafe.akka" %% "akka-actor" % "2.3.15",

  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",

  //akka testkit
  "com.typesafe.akka" %% "akka-testkit" % "2.3.15" % "test",

  //scala test
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)