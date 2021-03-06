package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _21_filterUsingFlatMapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._21_filterUsingFlatMap._

  test("filter using flatMap") {
    filter(List(1, 2, 3, 4, 5, 6))(_ % 2 == 0) shouldEqual List(2, 4, 6)
  }
}
