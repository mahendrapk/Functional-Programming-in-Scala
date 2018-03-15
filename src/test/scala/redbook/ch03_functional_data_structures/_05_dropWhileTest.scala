package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _05_dropWhileTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._05_dropWhile._

  test("testDropWhile") {
    dropWhile(MyList(1, 2, 3, 4), (x: Int) => x < 3) shouldEqual MyList(3, 4)
    dropWhile(MyList(1, 2, 3, 4), (x: Int) => x != 5) shouldEqual Nil
    dropWhile(Nil, (x: Int) => x > 10) shouldEqual Nil
  }

}
