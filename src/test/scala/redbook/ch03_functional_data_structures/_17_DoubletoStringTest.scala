package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _17_DoubletoStringTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._17_DoubletoString._

  test("double to string") {
    doubleToString(MyList(1.0, 2.0, 3.0)) shouldEqual(MyList("1.0", "2.0", "3.0"))
  }


}
