package com.indix

import com.twitter.scalding.{Args, Job, TextLine, Tsv}

class WordCount(args: Args) extends Job(args) {
  TextLine(args("input"))
    .flatMap('line -> 'word) { line: String => line.toLowerCase.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+") }
    .groupBy('word) {
      _.size
    }
    .write(Tsv(args("output")))
}
