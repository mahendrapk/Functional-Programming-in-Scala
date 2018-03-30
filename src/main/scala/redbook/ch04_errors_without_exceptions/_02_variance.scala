package redbook.ch04_errors_without_exceptions

/*
  Implement the variance function in terms of flatMap. If the mean of a sequence is m,
  the variance is the mean of math.pow(x - m, 2) for each element x in the sequence.
  See the definition of variance on Wikipedia (http://mng.bz/0Qsr).
  def variance(xs: Seq[Double]): Option[Double]

 */

object _02_variance {

  def mean(l: List[Double]): Option[Double] = l match {
    case Nil ⇒ None
    case _   ⇒ Some(l.sum / l.size)
  }

  def variance(l: List[Double]): Option[Double] = mean(l).flatMap(m ⇒ mean(l.map(x ⇒ math.pow(x - m, 2))))
}
