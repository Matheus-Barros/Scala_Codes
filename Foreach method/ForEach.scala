//@Author: Matheus Barros
//Date: 03/21/2021

object Foreach {
  def lessThanTen(var1:Int){
    if (var1 < 10)
      println("True")
    else
      println("False")
  }

  def main(args: Array[String]): Unit = {
    val array = Array(15,2,9,98,100)
    
    //It'll loop trough the array, and apply the function to each element
    array.foreach(lessThanTen)
  }
}
