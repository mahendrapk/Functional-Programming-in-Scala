package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _22_listPairAdditionTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._22_listPairAddition._

  test("testAddListPair") {
    addListPair(List(1, 2, 3, 4), List(1, 2, 3, 4)) shouldEqual List(2, 4, 6, 8)
    addListPair(Nil, List(1, 2, 3, 4)) shouldEqual Nil
    addListPair(List(1, 2, 3, 4), Nil) shouldEqual Nil
  }

}
