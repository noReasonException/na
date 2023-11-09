import scala.annotation.tailrec
import scala.util.Try
case class

TriangleGraph private (connections:List[(Int,Int)]){
  val map : Map[Int,Int] = Map.from(connections)
}




object TriangleGraph{
  def build (levels: List[List[Int]]): TriangleGraph ={
    val connections = levels.tail.foldLeft((levels.head,List.empty[(Int,Int)]))((previousLevelWithConnections,currLevel)=>{
      val currentConnections: List[(Int, Int)] = previousLevelWithConnections._1.zipWithIndex.flatMap(nodeWithIndex=>{
        val left = Try.apply(currLevel(nodeWithIndex._2)).toOption
        val right = Try.apply(currLevel(nodeWithIndex._2+1)).toOption
        left.toList.map((nodeWithIndex._1,_))::: right.toList.map((nodeWithIndex._1,_))
      })
      (currLevel,previousLevelWithConnections._2:::currentConnections)
    })
    TriangleGraph(connections._2)
  }
  //Get a graph, return the sum of all different paths
  def binaryPaths(connections:List[(Int,Int)],sum:Int,lvl:Int):List[Int] = {
    println(lvl+"Initialized")
    lvl match {
      case 1=> List(sum)
      case _ => connections.take(2).flatMap(each=>binaryPaths(connections.drop(2),sum+each._2,lvl-1))

    }
  }
}
