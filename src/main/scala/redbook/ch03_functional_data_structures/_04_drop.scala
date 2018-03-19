package redbook.ch03_functional_data_structures

/*
  Exercise 3.4 description:
  Generalize tail to the function drop, which removes the first n elements from a list.
  Note that this function takes time proportional only to the number of elements being
  dropped—we don’t need to make a copy of the entire List.
 */

object _04_drop {

  def drop[T](l: MyList[T], n: Int): MyList[T] = {
    if (n <= 0) l
    else {
      l match {
        case Nil        ⇒ Nil
        case Cons(_, t) ⇒ drop(t, n - 1)
      }
    }
  }

}
