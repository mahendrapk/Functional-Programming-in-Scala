package redbook.ch04_errors_without_exceptions

/*
  Exercise 4.1 description:

  Implement all of the preceding functions on Option. As you implement each function,
  try to think about what it means and in what situations you’d use it. We’ll explore when
  to use each of these functions next. Here are a few hints for solving this exercise:

  - It’s fine to use pattern matching, though you should be able to implement all
  the functions besides map and getOrElse without resorting to pattern matching.

  - For map and flatMap, the type signature should be enough to determine the
  implementation.

  - getOrElse returns the result inside the Some case of the Option, or if the Option
  is None, returns the given default value.

  - orElse returns the first Option if it’s defined; otherwise, it returns the second
  Option.

 */

sealed trait Option[+A] {

  def map[B](f: A ⇒ B): Option[B] = this match {
    case None    ⇒ None
    case Some(x) ⇒ Some(f(x))
  }

  def getOrElse[B >: A](default: ⇒ B): B = this match {
    case None    ⇒ default
    case Some(x) ⇒ x
  }

  //for Some(X) map will produce Some[Some[X]]; then use getOrElse to peel off top Some to get Some[X]
  def flatMap[B](f: A ⇒ Option[B]): Option[B] = map(f).getOrElse(None)

  //for Some(X) map will produce Some[Some[X]]; then use getOrElse to peel off top Some to get Some[X]
  def orElse[B >: A](ob: ⇒ Option[B]): Option[B] = this.map(Some(_)).getOrElse(ob)

  //explicit checking with pattern match
  def orElse1[B >: A](ob: ⇒ Option[B]): Option[B] = this match {
    case None ⇒ ob
    case _    ⇒ this
  }

  //explicit checking with pattern match
  def filter(f: A ⇒ Boolean): Option[A] = this match {
    case Some(x) if f(x) ⇒ this
    case _               ⇒ None
  }

  def filter1(f: A ⇒ Boolean): Option[A] = flatMap(x ⇒ if (f(x)) this else None)
}

object Option {
  //a here, is an argument supplied to a returning function
  def lift[A, B](f: A ⇒ B): Option[A] ⇒ Option[B] = (a: Option[A]) ⇒ a.map(f)
}

case class Some[+A](get: A) extends Option[A]
case object None            extends Option[Nothing]
