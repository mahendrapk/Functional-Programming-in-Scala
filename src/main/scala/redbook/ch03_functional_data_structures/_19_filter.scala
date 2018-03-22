package redbook.ch03_functional_data_structures

/*
  Exercise 3.19 description:

  Write a function filter that removes elements from a list unless they satisfy a given predicate.
  Use it to remove all odd numbers from a List[Int].
 */

object _19_filter {

  import redbook.ch03_functional_data_structures.MyList._

  def filter[A](as: MyList[A])(f: A => Boolean): MyList[A] = {
    var buffer = new collection.mutable.ListBuffer[A]

    def go(as: MyList[A]): Unit = as match {
      case Nil        ⇒ ()
      case Cons(h, t) ⇒ if (f(h)) buffer += h; go(t)
    }

    go(as)
    MyList(buffer.toList: _*)
  }

  def filter1[A](as: MyList[A])(f: A ⇒ Boolean): MyList[A] =
    foldRight(as, Nil: MyList[A])((h, t) ⇒ if (f(h)) Cons(h, t) else t)
}
