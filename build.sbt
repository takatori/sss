name := """sss"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))

scalaVersion := "2.11.7"

libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "1.1.0"

fork in run := true