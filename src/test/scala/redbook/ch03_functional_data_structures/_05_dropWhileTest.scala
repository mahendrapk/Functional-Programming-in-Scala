package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _05_dropWhileTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._05_dropWhile._

  test("dropWhile") {
    dropWhile(List(1, 2, 3, 4), (x: Int) => x < 3) shouldEqual List(3, 4)
    dropWhile(List(1, 2, 3, 4), (x: Int) => x != 5) shouldEqual Nil
    dropWhile(Nil, (x: Int) => x > 10) shouldEqual Nil
  }

  test("curried dropWhile makes smart Type inference") {
    dropWhile2(List(1, 2, 3, 4))(x => x < 3) shouldEqual List(3, 4)
    dropWhile2(List(1, 2, 3, 4))(x => x != 5) shouldEqual Nil
  }

}
