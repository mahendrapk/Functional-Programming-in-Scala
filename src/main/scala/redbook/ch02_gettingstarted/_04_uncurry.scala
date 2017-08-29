package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

class _04_uncurry extends FunSuite with Matchers {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def cheatingUncurry[A, B, C](f: A => B => C): (A, B) => C =
    Function.uncurried(f)

}
