package redbook.ch03_functional_data_structures

/*
  Exercise 3.22 description:

  Write a function that accepts two lists and constructs a new list by adding corresponding
  elements. For example, List(1,2,3) and List(4,5,6) become List(5,7,9).
 */

object _22_listPairAddition {

  def addListPair(l: MyList[Int], r: MyList[Int]): MyList[Int] = (l, r) match {
    case (Nil, _)                     ⇒ Nil
    case (_, Nil)                     ⇒ Nil
    case (Cons(h1, t1), Cons(h2, t2)) ⇒ Cons(h1 + h2, addListPair(t1, t2))
  }

}
