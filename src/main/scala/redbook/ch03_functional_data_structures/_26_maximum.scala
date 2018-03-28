package redbook.ch03_functional_data_structures

/*
  Exercise 3.26 description:

  Write a function maximum that returns the maximum element in a Tree[Int]. (Note:
  In Scala, you can use x.max(y) or x max y to compute the maximum of two integers x
  and y.)
 */

object _26_maximum {

  def maximum(tree: Tree[Int]): Leaf[Int] = tree match {
    case n: Leaf[Int] ⇒ n
    case Branch(l, r) ⇒ Leaf(maximum(l).value max maximum(r).value)
  }
}
