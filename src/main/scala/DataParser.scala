class DataParser(filename:String) {
  private val rawData: List[String] = scala.io.Source.fromFile(filename).getLines().toList
  private lazy val flatten = rawData.flatMap(_.split(" "))
  def getRawData:List[String] = rawData
  //will need this for getting the n
  def getLines: List[List[Int]] = rawData.map(_.split(" ").map(_.toInt).toList)
  //will need this for getting easy absolute indexes
  def getFlattenData: List[String] = flatten

}
