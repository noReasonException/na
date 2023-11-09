object Main {
  def main(args: Array[String]): Unit = {
    val data = new DataParser("data_pico.txt")
    val levels = data.getLines.length
    val nodes = (1+levels)*(levels/2)
    val graph = TriangleGraph.build(data.getLines)
    println(data.getLines)
    println(graph)
    println(TriangleGraph.binaryPaths(graph.connections,0))
  }

}