package redbook.ch03_functional_data_structures

object _05_dropWhile {
  def dropWhile[T](l: MyList[T], f: T => Boolean): MyList[T] = l match {
    case Cons(h, t) if f(h) ⇒ dropWhile(t, f)
    case _                  ⇒ l
  }
}
