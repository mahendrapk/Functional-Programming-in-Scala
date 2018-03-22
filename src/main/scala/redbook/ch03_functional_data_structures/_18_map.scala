package redbook.ch03_functional_data_structures

/*
  Exercise 3.18 description:

  Write a function map that generalizes modifying each element in a list while maintaining
  the structure of the list.
 */

object _18_map {

  import redbook.ch03_functional_data_structures.MyList._
  import redbook.ch03_functional_data_structures._13_foldVariations._

  def map1[A, B](as: MyList[A])(f: A => B): MyList[B] =
    foldRight(as, Nil: MyList[B])((h, t) ⇒ Cons(f(h), t))

  def map2[A, B](as: MyList[A])(f: A => B): MyList[B] =
    foldRightViaFoldLeft(as, Nil: MyList[B])((h, t) ⇒ Cons(f(h), t))

  def map3[A, B](as: MyList[A])(f: A => B): MyList[B] = {
    val buf = new collection.mutable.ListBuffer[B]

    def go(as: MyList[A]): Unit = as match {
      case Nil        ⇒ ()
      case Cons(h, t) ⇒ buf += f(h); go(t)
    }

    go(as)
    MyList(buf.toList: _*)
  }
}
