package redbook.ch04_errors_without_exceptions

import org.scalatest.{FunSuite, Matchers}

class _03_map2Test extends FunSuite with Matchers {

  import redbook.ch04_errors_without_exceptions._03_map2._

  test("test Maps") {
    map2(Some(100), Some(200))(_ + _) shouldEqual Some(300)
    map3(Some(100), Some(200))(_ + _) shouldEqual Some(300)
    map3(None: Option[Int], Some(200))(_ + _) shouldEqual None
    map2(Some(100), Some(List(200, 300, 400)))(_ :: _) shouldEqual Some(List(100, 200, 300, 400))
  }
}
