package com.jetlore.decorator.tag.html

import com.jetlore.decorator.tag.Tag

/**
  * String tag. Prints text inside tag
  *
  * @author vdonets
  */
class Strong extends Tag {
  override protected val format: String = "<strong>%s</strong>"
}
