object Main {
  def main(args: Array[String]): Unit =
    println("minPath is "+run(args(0)))

  def run(filename:String):Int={
    val data = new DataParser(filename)
    val levels = data.getLines.length
    val nodes = (1+levels)*(levels/2)
    val graph = TriangleGraph.build(data.getLines)
    TriangleGraph.binaryPaths(graph.connections,0,levels).min

  }

}