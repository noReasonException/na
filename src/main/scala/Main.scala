object Main {


  def readInput(filename:String):List[String] = scala.io.Source.fromFile(filename).getLines().toList

  def main(args: Array[String]): Unit = {
    println(readInput("data_small.txt").take(2))
  }
}