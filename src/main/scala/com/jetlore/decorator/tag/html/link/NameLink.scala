package com.jetlore.decorator.tag.html.link

/**
  * Link tag implementation for Twitter names.
  * Builds link by appending it to static
  * Twitter URL.
  *
  * @author vdonets
  */
class NameLink extends HtmlLink {

  override def decorate(text: String): String =
    String.format(format, "http://twitter.com/" + text, text)
}
