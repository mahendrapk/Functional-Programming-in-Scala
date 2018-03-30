package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _06_initTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._06_init._

  test("init") {

    init(List(1, 2, 3, 4)) shouldEqual List(1, 2, 3)
    init(List(1)) shouldEqual Nil
  }

}
