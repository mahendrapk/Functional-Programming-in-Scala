package redbook.ch03_functional_data_structures

/*
  Exercise 3.8 description:

  See what happens when you pass Nil and Cons themselves to foldRight, like this:
  foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_)).10 What do you think this
  says about the relationship between foldRight and the data constructors of List?
 */

object _08_foldRightAsConstructor {

  import redbook.ch03_functional_data_structures.MyList._

  def cloneList[A](l: MyList[A]) = foldRight(l, Nil: MyList[A])(Cons(_, _))

}
