class DataParser(filename:String) {
  private val rawData: List[String] = scala.io.Source.fromFile(filename).getLines().toList
  def getRawData:List[String] = rawData
  //will need this for getting the n
  def getLines: List[List[Int]] = rawData.map(_.split(" ").map(_.toInt).toList)

}
