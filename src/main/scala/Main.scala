object Main {
  def main(args: Array[String]): Unit = {
    val data = new DataParser(args(0))
    val levels = data.getLines.length
    val nodes = (1+levels)*(levels/2)
    val graph = TriangleGraph.build(data.getLines)
    println(TriangleGraph.binaryPaths(graph.connections,0,levels).min)

  }

}