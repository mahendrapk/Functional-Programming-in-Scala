package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _15_ListOfListsConcatTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._15_ListOfListsConcat._

  test("list of lists concat") {

    val lists = MyList(MyList(1, 2), MyList(3, 4), MyList(5, 6))

    concat(lists) shouldEqual MyList(1, 2, 3, 4, 5, 6)
  }
}
