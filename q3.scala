object q3{
  def main(args: Array[String]): Unit = {
    println("Enter the number of Fibonacci numbers to print:")
    val n = scala.io.StdIn.readInt()
    println(s"The first $n Fibonacci numbers are:")
    for (i <- 0 until n) {
      println(fibonacci(i))
    }
  }

  def fibonacci(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(n - 1) + fibonacci(n - 2)
    }
  }
}
