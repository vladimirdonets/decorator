package com.jetlore.decorator

import com.jetlore.decorator.concept.Concept
import com.jetlore.util.LazyLogging

/**
  * A decorator that uses text and concepts to print
  * HTML
  */
class Decorator extends LazyLogging {

  /**
    * Decorates given text using given concepts
    *
    * @param text     text to decorate
    * @param concepts concepts
    * @return decorated text
    */
  def decorate(text: String, concepts: Seq[Concept]): String = {
    logger.debug("Decorating [" + text + "] using " + concepts)
    val sorted = scala.util.Sorting.stableSort(concepts,
      (e1: Concept, e2: Concept) => e1.from < e2.from)

    val builder = new StringBuilder
    var i = 0
    sorted.foreach(concept => {
      logger.trace("parsing " + concept)
      logger.trace("starting idx = " + i)
      if (i > concept.from)
        throw new IllegalStateException("Overlapping concepts between [" + i + "] and [" + concept.from + "]")
      if (concept.from > concept.to)
        throw new IllegalStateException("Invalid concept indices " + concept)
      builder.append(text.substring(i, concept.from))
      i = concept.from
      builder.append(
        concept.tag.decorate(text.substring(concept.from, concept.to))
      )
      i = concept.to
    })
    return builder.mkString
  }
}
