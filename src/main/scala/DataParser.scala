class DataParser(filename:String) {
  private lazy val rawData: List[String] = scala.io.Source.fromFile(filename).getLines().toList
  private lazy val flatten = rawData.flatMap(_.split(" "))
  def getRawData:List[String] = rawData
  def getFlattenData: List[String] = flatten

}
