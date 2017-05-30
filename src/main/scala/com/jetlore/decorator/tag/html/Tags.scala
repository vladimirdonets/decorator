package com.jetlore.decorator.tag.html

import com.jetlore.decorator.tag.html.link.{NameLink, SimpleLink}

/**
  * Holds tags
  *
  * @author vdonets
  */
object Tags {

  val strong = new Strong
  val nameLink = new NameLink
  val simpleLink = new SimpleLink
}
