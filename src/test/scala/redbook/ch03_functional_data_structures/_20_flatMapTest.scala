package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _20_flatMapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._20_flatMap._

  test("testFlatMap2") {
    flatMap(List(1, 2, 3))(x ⇒ List(x - 1, x, x + 1)) shouldEqual List(0, 1, 2, 1, 2, 3, 2, 3, 4)
    flatMap2(List(1, 2, 3))(x ⇒ List(x - 1, x, x + 1)) shouldEqual List(0, 1, 2, 1, 2, 3, 2, 3, 4)
  }

}
