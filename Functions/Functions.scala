//@Author: Matheus Barros
//Date: 03/21/2021

object Functions {

  def main(hand: Int) = {
    hand > 21
  }

  def main(args: Array[String]): Unit = {
    println(main(20))
    println(main(22))
  }

}
