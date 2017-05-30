package com.jetlore.decorator.concept

import com.jetlore.decorator.tag.Tag
import com.jetlore.decorator.tag.html.Tags

/**
  * UserName concept prints to name link tag
  *
  * @param from starting index of concept
  * @param to   ending index of concept
  * @see [[com.jetlore.decorator.tag.html.link.NameLink]]
  * @author vdonets
  */

case class UserName
(override val from: Int,
 override val to: Int) extends Concept {
  override val tag: Tag = Tags.nameLink
}
