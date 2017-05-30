package com.jetlore.util

import org.slf4j.{Logger, LoggerFactory}

/**
  * Logging mixin
  *
  * @author vdonets
  */
trait LazyLogging {

  private lazy val name = getClass.getName

  protected lazy val logger = new LazyLogger {
    private val log: Logger =
      LoggerFactory.getLogger(name)

    override def error(f: => String): Unit = {
      if (log.isErrorEnabled)
        log.error(f)
    }

    override def warn(f: => String): Unit = {
      if (log.isWarnEnabled)
        log.warn(f)
    }

    override def info(f: => String): Unit = {
      if (log.isInfoEnabled)
        log.info(f)
    }

    override def debug(f: => String): Unit = {
      if (log.isDebugEnabled)
        log.debug(f)
    }

    override def trace(f: => String): Unit = {
      if (log.isTraceEnabled)
        log.trace(f)
    }
  }
}

trait LazyLogger {

  def error(f: => String): Unit

  def warn(f: => String): Unit

  def info(f: => String): Unit

  def debug(f: => String): Unit

  def trace(f: => String): Unit
}