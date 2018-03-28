package redbook.ch03_functional_data_structures

import scala.annotation.tailrec

/*
  Exercise 3.24 description:

  Hard: As an example, implement hasSubsequence for checking whether a List contains
  another List as a subsequence. For instance, List(1,2,3,4) would have
  List(1,2), List(2,3), and List(4) as subsequences, among others. You may have
  some difficulty finding a concise purely functional implementation that is also efficient.
  That’s okay. Implement the function however comes most naturally. We’ll
  return to this implementation in chapter 5 and hopefully improve on it. Note: Any
  two values x and y can be compared for equality in Scala using the expression x == y.
 */

object _24_hasSubsequqnce {

  @tailrec
  private def hasFullMatch[A](l1: MyList[A], l2: MyList[A]): Boolean = (l1, l2) match {
    //end of subsequence list
    case (_, Nil) ⇒ true
    //head matched, continue!!
    case (Cons(h1, t1), Cons(h2, t2)) if h1 == h2 ⇒ hasFullMatch(t1, t2)
    //any other case means - no good
    case _ ⇒ false
  }

  @tailrec
  def hasSubsequence[A](sup: MyList[A], sub: MyList[A]): Boolean = sup match {
    case Nil                         ⇒ sub == Nil
    case _ if hasFullMatch(sup, sub) ⇒ true
    case Cons(h, t)                  ⇒ hasSubsequence(t, sub)
  }
}
