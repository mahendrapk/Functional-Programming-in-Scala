package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _24_hasSubsequqnceTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._24_hasSubsequqnce._

  test("testHasSubsequence") {
    hasSubsequence(MyList(1, 2, 3, 4), MyList(1, 2)) shouldEqual true
    hasSubsequence(MyList(1, 2, 3, 4), MyList(3, 4)) shouldEqual true
    hasSubsequence(MyList(1, 2, 3, 4), MyList(4)) shouldEqual true
    hasSubsequence(MyList(1, 2, 3, 4, 5, 6), MyList(1, 2, 3, 10)) shouldEqual false

    hasSubsequence(MyList(4), MyList(1, 2, 3, 4)) shouldEqual false
    hasSubsequence(MyList(1, 2, 3, 4), MyList(10, 11)) shouldEqual false
    hasSubsequence(MyList(1, 2, 3, 4), Nil) shouldEqual true
  }

}
