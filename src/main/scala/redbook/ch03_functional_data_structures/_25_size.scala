package redbook.ch03_functional_data_structures

import scala.annotation.tailrec

/*
  Exercise 3.25 description:

  Write a function size that counts the number of nodes (leaves and branches) in a tree.
 */

object _25_size {

  def size[A](tree: Tree[A]): Int = tree match {
    case Leaf(_)      ⇒ 1
    case Branch(l, r) ⇒ 1 + size(l) + size(r)
  }
}
