name := "klasseliste"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.4",
  "net.databinder" %% "unfiltered-jetty" % "0.8.4",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)


scalacOptions += "-deprecation"
