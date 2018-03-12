package redbook.ch02_gettingstarted

//UnCurrying – a chain of single-argument functions, are composed into multiple argument function

object _04_uncurry {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)

  def cheatingUncurry[A, B, C](f: A => B => C): (A, B) => C =
    Function.uncurried(f)

}
