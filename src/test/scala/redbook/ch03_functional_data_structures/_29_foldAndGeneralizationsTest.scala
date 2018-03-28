package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _29_foldAndGeneralizationsTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._29_foldAndGeneralizations._

  test("testMapViaFold") {
    import redbook.ch03_functional_data_structures._28_map._

    val tree1 = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))
    mapViaFold(tree1)(_.toString) shouldEqual map(tree1)(_.toString)
    mapViaFold(Leaf(100))(_.toString) shouldEqual map(Leaf(100))(_.toString)
  }

  test("testSizeViaFold") {
    import redbook.ch03_functional_data_structures._25_size.{size ⇒ treeSize}

    val t1 = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))
    sizeViaFold(t1) shouldEqual treeSize(t1)

    sizeViaFold(Leaf(100)) shouldEqual treeSize(Leaf(100))

    val t2 = Branch(Leaf(100), Branch(Leaf(1), Leaf(2)))
    sizeViaFold(t2) shouldEqual treeSize(t2)
  }
}
