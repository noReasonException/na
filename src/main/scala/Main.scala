object Main {




  def main(args: Array[String]): Unit = {
    val data = new DataParser("data_small.txt")
    val tree = new BiTree(data.getFlattenData)

    println(tree.nodes)
  }
}