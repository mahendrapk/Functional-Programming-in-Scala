package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _04_dropTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._04_drop._

  test("simple drop") {
    drop(List(1, 2, 3, 4), 1) shouldEqual List(2, 3, 4)
    drop(List(1, 2, 3, 4), 3) shouldEqual List(4)
    drop(List(1, 2, 3, 4), 4) shouldEqual Nil
  }

  test("drop with zero") {
    drop(List(1, 2, 3, 4), 0) shouldEqual List(1, 2, 3, 4)
    drop(List(Nil), 0) shouldEqual List(Nil)
    drop(List(Nil), 1) shouldEqual Nil
  }

  test("drop equalTo or excess than length") {
    drop(List(1, 2, 3, 4), 4) shouldEqual Nil
    drop(List(1, 2, 3, 4), 5) shouldEqual Nil
    drop(List(Nil), 1) shouldEqual Nil
  }
}
