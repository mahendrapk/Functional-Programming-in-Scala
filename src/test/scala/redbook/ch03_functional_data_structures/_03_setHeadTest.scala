package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _03_setHeadTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._03_setHead._

  test("test tail function") {
    setHead(List(1, 2, 3, 4), 100) shouldEqual List(100, 2, 3, 4)
    setHead(List(1, 2), 100) shouldEqual List(100, 2)
    setHead(List(1), 100) shouldEqual List(100)
    setHead(Nil, 100) shouldEqual List(100)
  }
}
