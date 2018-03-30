package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _23_zipWithTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._23_zipWith._

  test("zipWith") {
    zipWith(List(1, 2, 3, 4), List(1, 2, 3, 4))(_ + _) shouldEqual List(2, 4, 6, 8)
  }

}
