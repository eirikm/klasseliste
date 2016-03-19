name := "klasseliste"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.4",
  "net.databinder" %% "unfiltered-jetty" % "0.8.4",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)


scalacOptions += "-deprecation"


// empty stage to please heroku
// see https://devcenter.heroku.com/articles/scala-support#build-behavior
val stage = taskKey[Unit]("Stage task")
val Stage = config("stage")
stage := {}
