//@Author: Matheus Barros
//Date: 03/21/2021

object Arrays {
  def main(args: Array[String]): Unit = {
    //The Any supertype
    var mixedTypes = new Array[Any](3)

    //String Arrays
    var array1 = new Array[String](3)
    array1(0) = "a"
    array1(1) = "b"
    array1(2) = "c"

    //or
    var array2 = Array("a","b","c")
  }
}
