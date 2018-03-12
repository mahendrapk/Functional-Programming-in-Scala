package redbook.ch02_gettingstarted

//Currying – decomposition of function with multiple arguments into a chain of single-argument functions.

object _03_curry {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def theCurry[A, B, C](f: (A, B) => C): A => (B => C) = f.curried

  def f(a: Int, b: Int): Int = a + b
  def g(a: Int)(b: Int): Int = a + b
}
