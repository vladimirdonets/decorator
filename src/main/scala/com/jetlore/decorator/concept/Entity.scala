package com.jetlore.decorator.concept

import com.jetlore.decorator.tag.Tag
import com.jetlore.decorator.tag.html.Tags

/**
  * Entity concept prints to a Strong tag
  *
  * @param from starting index of concept
  * @param to   ending index of concept
  * @see [[com.jetlore.decorator.tag.html.Strong]]
  * @author vdonets
  */
case class Entity
(override val from: Int,
 override val to: Int) extends Concept {

  override val tag: Tag = Tags.strong
}
