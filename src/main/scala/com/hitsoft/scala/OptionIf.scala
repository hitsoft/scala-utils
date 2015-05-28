package com.hitsoft.scala

/**
 * Shortcut instead of `if (condition) Option(value) else None` you may write `OptionIf(condition, value)`
 */
object OptionIf {
  def apply[T](value: => T, condition: Boolean): Option[T] = if (condition) Option(value) else None
  def apply[T](condition: Boolean, value: => T): Option[T] = if (condition) Option(value) else None
  def b(value: => Boolean, condition: Boolean): Option[Boolean] = if (condition) Option(value) else None
}
