package redbook.ch03_functional_data_structures

/*
  Exercise 3.7 description:

  Can product, implemented using foldRight, immediately halt the recursion and
  return 0.0 if it encounters a 0.0? Why or why not? Consider how any short-circuiting
  might work if you call foldRight with a large list.
 */

/*
    This is not possible. The reason is - the list is fully traversed even before the supplied function is applied to
    the arguments. There is an option for caller to additionally supply shortCircuit function but that changes the
    signature of foldRight
 */

class _07_productHalt {}
