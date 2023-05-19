import com.google.inject.Guice
import play.api.inject.bind
import play.api.inject.guice.GuiceApplicationBuilder

object Main {
  def main(args: Array[String]): Unit = {
    val injector = Guice.createInjector(new GuiceApplicationBuilder()
      .overrides(
        bind(classOf[TransferComparator]).annotatedWith(classOf[Named]).to(classOf[TransferComparatorA]),
        bind(classOf[TransferComparator]).annotatedWith(classOf[Named]).to(classOf[TransferComparatorB])
      )
      .build())

    val bankAccount1 = injector.getInstance(classOf[BankAccount])
    val bankAccount2 = injector.getInstance(classOf[BankAccount])

    // Perform operations on bank accounts using the injected comparators
    bankAccount1.transfer(bankAccount2)
  }
}
