package com.hitsoft

/**
 * Created by smeagol on 23.12.14.
 */
package object scala {
  /**
   * Do something with specific context
   * @example
   * doWith(someFunctionReturningContext()) {ctx =>
   * doSomethingWith(ctx)
   * doSomethingMore(ctx)
   * }
   * @param context operation context
   * @param action some action
   * @tparam A type of context
   * @tparam B type of result
   * @return
   */
  def doWith[A, B](context: A)(action: A => B): B = action(context)

  /**
   * Do something with two specific contexts
   * @param ctx1
   * @param ctx2
   * @param action
   * @tparam A
   * @tparam B
   * @tparam C
   * @return
   */
  def doWith[A, B, C](ctx1: A, ctx2: B)(action: (A, B) => C): C = action(ctx1, ctx2)
}
