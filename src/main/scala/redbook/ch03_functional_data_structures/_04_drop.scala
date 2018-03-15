package redbook.ch03_functional_data_structures

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
