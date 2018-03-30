package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _02_varianceTest extends org.scalatest.FunSuite with Matchers {

  import redbook.ch04_errors_without_exceptions._02_variance._

  test("testMean") {
    mean(List[Double](1, 2, 3, 4, 5)) shouldEqual Some(3.0)
    mean(List.empty) shouldEqual None
  }

  test("testVariance") {
    variance(List[Double](1, 2, 3, 4, 5)) shouldEqual Some(2.0)
    variance(List.empty) shouldEqual None
  }

}
