# scalding-get-started
Bare minimum code for running a scalding job

**Build**

`sbt clean assembly`


**Run**

`/path/to/hadoop jar target/scala-2.11/scalding-get-started-assembly-0.1.jar com.twitter.scalding.Tool com.example.WordCount --hdfs --input input --output output`