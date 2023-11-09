
class BasicSpec extends org.scalatest.funsuite.AnyFunSuite {
  test("Basic Example Case") {
    assert (Main.run("data_tiny.txt")==18,"data_tiny fails")
  }
}