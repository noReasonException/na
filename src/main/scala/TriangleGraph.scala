import scala.annotation.tailrec
import scala.util.Try
case class TriangleGraph private (connections:List[(Int,Int)])




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
}
