lazy val root = (project in file(".")).settings(
 name := "JustinDB-load-testing",
 version := "0.0.1",
 scalaVersion := "2.12.1",
 libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.3"
)

