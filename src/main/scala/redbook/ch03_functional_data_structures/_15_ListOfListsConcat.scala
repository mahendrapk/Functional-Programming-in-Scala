package redbook.ch03_functional_data_structures

import redbook.ch03_functional_data_structures.MyList._
import redbook.ch03_functional_data_structures._14_append._

object _15_ListOfListsConcat {
  def concat[A](ls: MyList[MyList[A]]): MyList[A] =
    foldRight(ls, Nil: MyList[A])(appendUsingFoldLeft)
}
