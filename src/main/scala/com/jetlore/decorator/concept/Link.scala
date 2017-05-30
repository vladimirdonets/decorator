package com.jetlore.decorator.concept

import com.jetlore.decorator.tag.Tag
import com.jetlore.decorator.tag.html.Tags

/**
  * Link concept prints to simple link tag
  *
  * @param from starting index of concept
  * @param to   ending index of concept
  * @see [[com.jetlore.decorator.tag.html.link.SimpleLink]]
  * @author vdonets
  */
case class Link
(override val from: Int,
 override val to: Int) extends Concept {
  override val tag: Tag = Tags.simpleLink
}
