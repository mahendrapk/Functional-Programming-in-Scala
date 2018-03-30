package redbook.ch03_functional_data_structures

/*
  Exercise 3.23 description:

  Generalize the function you just wrote so that it’s not specific to integers or addition.
  Name your generalized function zipWith.
 */

object _23_zipWith {

  def zipWith[A, B, C](l: List[A], r: List[B])(f: (A, B) ⇒ C): List[C] = (l, r) match {
    case (Nil, _)                     ⇒ Nil
    case (_, Nil)                     ⇒ Nil
    case (Cons(h1, t1), Cons(h2, t2)) ⇒ Cons(f(h1, h2), zipWith(t1, t2)(f))
  }

}
