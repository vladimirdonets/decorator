package com.jetlore.decorator.concept

import com.jetlore.decorator.tag.Tag

/**
  * Any concept that we will want to print as an html
  * or any other tag.
  *
  * @author vdonets
  */
trait Concept {

  /**
    * The tag this concept will be printed into
    */
  val tag: Tag
  /**
    * Start index of this concept
    */
  val from: Int
  /**
    * End index of this concept
    */
  val to: Int
}
