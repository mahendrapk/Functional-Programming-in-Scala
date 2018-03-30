package redbook.ch03_functional_data_structures

object _01_MatchExpression extends App {

  import redbook.ch03_functional_data_structures.List._

  val x = List(1, 2, 3, 4, 5) match {
    case Cons(x, Cons(2, Cons(4, _)))          ⇒ x
    case Nil                                   ⇒ 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) ⇒ x + y
    case Cons(h, t)                            ⇒ h + sum(t)
    case _                                     ⇒ 101
  }

  //should print 3
  println(x)

}
