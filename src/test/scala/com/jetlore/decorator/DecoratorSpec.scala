package com.jetlore.decorator

import com.jetlore.decorator.concept.{Entity, Link, UserName}
import com.jetlore.util.LazyLogging
import org.scalatest.FlatSpec


/**
  * @author vdonets
  */
class DecoratorSpec extends FlatSpec with LazyLogging {

  "DecoratedText" should "print its contents" in {
    val decorator = new Decorator
    val text = decorator.decorate(
      "Obama visited Facebook headquarters: http://bit.ly/xyz @elversatile",
      Seq(Entity(14, 22), Entity(0, 5), Link(37, 54), UserName(56, 67))
    )
    logger.info("text = " + text)
    assert(text.equals("<strong>Obama</strong> visited <strong>Facebook</strong> headquarters: <a href=\"http://bit.ly/xyz\">http://bit.ly/xyz</a> @<a href=\"http://twitter.com/elversatile\">elversatile</a>"))
  }
}
