
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Source
import rx.lang.scala.Observable
import scala.concurrent.duration._
import main.main

object AkkaRxScalaExample {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("my-system")
    implicit val materializer = ActorMaterializer()
    import system.dispatcher

    val source = Source.tick(0.seconds, 1.second, "tick")

    val observable: Observable[String] = Observable.create { observer =>
      source.runForeach(observer.onNext)
      observer.onCompleted()
    }

    observable.subscribe { tick =>
      println(s"Received tick: $tick")
    }

    Thread.sleep(5000)
    system.terminate()
  }
}
