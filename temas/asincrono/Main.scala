import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.StdIn

object Main extends App {
  val asyncSum = new AsyncSum()

  println("Enter a number to calculate the consecutive sum of the squares:");

  // Leer el número desde la entrada estándar
  val n = StdIn.readInt()

  val futureSum = asyncSum.sumOfSquares(n)

  futureSum.foreach(sum => println(s"Sum of squares of first $n numbers: $sum"))

  // Esperar hasta que se complete el futuro antes de finalizar el programa
  val result = Await.result(futureSum, 5.seconds)
  println(s"Result: $result")
}

