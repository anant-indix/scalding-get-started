name := "scalding-get-started"

version := "0.1"

scalaVersion := "2.11.8"

resolvers ++= Seq("abcd" at "http://conjars.org/repo/")

libraryDependencies ++= Seq(
			"com.twitter" %% "scalding-core" % "0.17.3",
			"cascading" % "cascading-hadoop" % "2.6.1",
			"org.apache.hadoop" % "hadoop-client" % "2.9.0" % Provided)
