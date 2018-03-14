package redbook.ch02_gettingstarted

//UnCurrying – a chain of single-argument functions, are composed into multiple argument function

/*
  Exercise 2.4 description:

  Implement uncurry, which reverses the transformation of curry. Note that since =>
  associates to the right, A => (B => C) can be written as A => B => C.
 */

object _04_uncurry {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def cheatingUncurry[A, B, C](f: A => B => C): (A, B) => C =
    Function.uncurried(f)

}
