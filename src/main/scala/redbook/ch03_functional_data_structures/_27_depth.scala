package redbook.ch03_functional_data_structures

/*
  Exercise 3.27 description:

  Write a function depth that returns the maximum path length from the root of a tree to any leaf.
 */

object _27_depth {

  def depth[A](tree: Tree[A]): Int = tree match {
    case Leaf(_)      ⇒ 0
    case Branch(l, r) ⇒ 1 + (depth(l) max depth(r))
  }
}
