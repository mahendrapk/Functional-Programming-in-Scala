package redbook.ch03_functional_data_structures

import scala.annotation.tailrec

/*
  Exercise 3.10 description:

  Our implementation of foldRight is not tail-recursive and will result in a StackOverflowError
  for large lists (we say it’s not stack-safe). Convince yourself that this is the
  case, and then write another general list-recursion function, foldLeft, that is tail-recursive,
  using the techniques we discussed in the previous chapter.
 */

object _10_foldLeft {

//  def foldRight[A, B](as: MyList[A], z: B)(f: (A, B) ⇒ B): B = as match {
//    case Nil        ⇒ z
//    case Cons(h, t) ⇒ f(h, foldRight(t, z)(f))
//  }

  @tailrec
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = as match {
    case Nil        ⇒ z
    case Cons(h, t) ⇒ foldLeft(t, f(z, h))(f)
  }
}
