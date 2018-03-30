package redbook.ch03_functional_data_structures

/*
  Exercise 3.8 description:

  See what happens when you pass Nil and Cons themselves to foldRight, like this:
  foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_)).10 What do you think this
  says about the relationship between foldRight and the data constructors of List?
 */

object _08_foldRightAsConstructor {

  import redbook.ch03_functional_data_structures.List._

  def cloneList[A](l: List[A]) = foldRight(l, Nil: List[A])(Cons(_, _))

}
