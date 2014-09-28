name := "currency-fetcher"

version := "1.0"

scalaVersion := "2.10.4"



libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.10" % "2.3.6",
  "org.json4s" % "json4s-jackson_2.10" % "3.2.10",
  "net.databinder.dispatch" % "dispatch-core_2.10" % "0.11.2",
  "com.ning" % "async-http-client" % "1.8.13",
  "io.argonaut" % "argonaut_2.10" % "6.0.4"
)

mainClass := Some("com.scala.bala.MainApp")