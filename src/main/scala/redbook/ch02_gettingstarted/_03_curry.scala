package redbook.ch02_gettingstarted

//Currying – decomposition of function with multiple arguments into a chain of single-argument functions.

/*
  Exercise 2.3 description:

  Let’s look at another example, currying,9 which converts a function f of two arguments
  into a function of one argument that partially applies f. Here again there’s only one
  implementation that compiles. Write this implementation.
 */

object _03_curry {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def theCurry[A, B, C](f: (A, B) => C): A => (B => C) = f.curried

  def f(a: Int, b: Int): Int = a + b
  def g(a: Int)(b: Int): Int = a + b
}
