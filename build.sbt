name := "scalding-get-started"

version := "0.1"

scalaVersion := "2.11.8"

resolvers ++= Seq("conjars" at "http://conjars.org/repo/")

libraryDependencies ++= Seq(
			"com.twitter" %% "scalding-core" % "0.17.4",
			"org.apache.hadoop" % "hadoop-client" % "2.9.0" % Provided
)
