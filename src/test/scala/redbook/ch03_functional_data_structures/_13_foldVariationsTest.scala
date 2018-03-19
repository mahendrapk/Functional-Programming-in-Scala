package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _13_foldVariationsTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._13_foldVariations._

  test("foldRightViaFoldLeft") {
    foldRightViaFoldLeft(MyList(1, 2, 3, 4), 0)(_ + _) shouldEqual 10
    foldRightViaFoldLeft(MyList(1, 2, 3, 4), "")((h, s) ⇒ s.concat(h.toString)) shouldEqual "4321"
  }

  test("foldRightViaFoldLeft2") {
    foldRightViaFoldLeft2(MyList(1, 2, 3, 4), 0)(_ + _) shouldEqual 10
    foldRightViaFoldLeft2(MyList(1, 2, 3, 4), "")((h, s) ⇒ s.concat(h.toString)) shouldEqual "4321"
  }

  test("foldLeftViaFoldRight") {
    foldLeftViaFoldRight(MyList(1, 2, 3, 4), 0)(_ + _) shouldEqual 10
    foldLeftViaFoldRight(MyList(1, 2, 3, 4), "")((h, s) ⇒ s.concat(h.toString)) shouldEqual "1234"
  }
}
