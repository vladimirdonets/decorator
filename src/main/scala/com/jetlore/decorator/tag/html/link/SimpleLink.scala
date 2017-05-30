package com.jetlore.decorator.tag.html.link

/**
  * Simple link implementation. Uses
  * text for URL
  *
  * @author vdonets
  */
class SimpleLink extends HtmlLink {


  override def decorate(text: String): String =
    String.format(format, text, text)
}
