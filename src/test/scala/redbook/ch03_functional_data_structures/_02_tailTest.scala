package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _02_tailTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._02_tail._

  test("test tail function") {
    tail(List(1, 2, 3, 4)) shouldEqual List(2, 3, 4)
    tail(List(1, 2)) shouldEqual List(2)
    tail(List(1)) shouldEqual Nil
    tail(tail(tail(tail(List(1, 2, 3, 4))))) shouldEqual Nil
  }
}
