//@Author: Matheus Barros
//Date: 03/21/2021

object Lists {
  def main(args: Array[String]): Unit = {
    //Can be declared like this:
    val players = List("Marcos","Bill","Jason")
    //Or likethis:
    val players2 = "Joseph"::"Edmundo"::"Clark":: List()
    val players3 = "Joseph"::"Edmundo"::"Clark":: Nil

    //Add values in a list
    val playeradded = "Matheus" :: players

    //Join lists
    val allplayers = players ::: players2


    println(allplayers)

  }

}
