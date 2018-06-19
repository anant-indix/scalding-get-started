name := "scalding-get-started"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "com.twitter" %% "scalding-core" % "0.17.4"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.9.0" % Provided

assemblyMergeStrategy in assembly := {
  case m if m.toLowerCase.endsWith("manifest.mf") => MergeStrategy.discard
  case m if m.toLowerCase.matches("meta-inf.*\\.sf$") => MergeStrategy.discard
  case "log4j.properties" => MergeStrategy.discard
  case m if m.toLowerCase.startsWith("meta-inf/services/") => MergeStrategy.filterDistinctLines
  case "reference.conf" => MergeStrategy.concat
  case _ => MergeStrategy.first
}
