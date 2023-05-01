import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}
import concurrent.ExecutionContext.Implicits.global

class AsyncSum {
  def sumOfSquares(n: Int): Future[Int] = {
    val promise = Promise[Int]()

    val sumOfSquaresFuture = Future {
      var sum = 0
      for (i <- 1 to n) {
        sum += i * i
        Thread.sleep(100) // Simulating a long computation
      }
      sum
    }

    sumOfSquaresFuture.onComplete {
      case Success(result) => promise.success(result)
      case Failure(exception) => promise.failure(exception)
    }

    promise.future
  }
}
