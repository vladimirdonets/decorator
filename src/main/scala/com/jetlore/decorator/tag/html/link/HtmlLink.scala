package com.jetlore.decorator.tag.html.link

import com.jetlore.decorator.tag.Tag

/**
  * Base trait for an html link tag
  *
  * @author vdonets
  */
trait HtmlLink extends Tag {

  override protected val format: String = "<a href=\"%s\">%s</a>"
}