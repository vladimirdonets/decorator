package com.jetlore.decorator.tag

/**
  * Base trait for any tag.
  *
  * @author vdonets
  */
trait Tag {

  /**
    * Decorates text with this HTML tag
    *
    * @param text text to decorate
    * @return decorated text
    */
  def decorate(text: String): String =
    String.format(format, text)

  /**
    * The format, ie <strong>%s</strong>
    * this tag will use
    */
  protected val format: String
}
