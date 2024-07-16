object q1 {
  def getProductList(): List[String] = {
    var productList: List[String] = List()
    var input: String = ""

    println("Enter product names (type 'done' to finish):")
    input = scala.io.StdIn.readLine()
    while (input != "done") {
      productList = productList :+ input
      input = scala.io.StdIn.readLine()
    }

    productList
  }

  def printProductList(productList: List[String]): Unit = {
    productList.zipWithIndex.foreach { case (product, index) =>
      println(s"${index +1}. $product")
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList()
    println("\nProduct List:")
    printProductList(products)
    println(s"\nTotal number of products: ${getTotalProducts(products)}")
  }
}

