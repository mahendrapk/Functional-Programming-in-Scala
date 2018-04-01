package redbook.ch04_errors_without_exceptions

object _05_sequenceViaTraverse {
  import redbook.ch04_errors_without_exceptions._04_02_traverse._

  def sequenceViaTraverse[A](a: List[Option[A]]): Option[List[A]] = traverse(a)(x => x)
}
