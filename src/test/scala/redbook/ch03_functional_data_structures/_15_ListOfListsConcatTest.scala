package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _15_ListOfListsConcatTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._15_ListOfListsConcat._

  test("list of lists concat") {

    val lists = List(List(1, 2), List(3, 4), List(5, 6))

    concat(lists) shouldEqual List(1, 2, 3, 4, 5, 6)
  }
}
