package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _29_foldAndGeneralizationsTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._29_foldAndGeneralizations._
  import redbook.ch03_functional_data_structures._28_map._

  test("testMapViaFold") {
    val tree1 = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))
    mapViaFold(tree1)(_.toString) shouldEqual map(tree1)(_.toString)
    mapViaFold(Leaf(100))(_.toString) shouldEqual map(Leaf(100))(_.toString)
  }
}
