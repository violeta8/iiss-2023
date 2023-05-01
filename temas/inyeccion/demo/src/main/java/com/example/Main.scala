import play.api.inject.playBuiltinModule
import play.api.inject.guice.GuiceApplicationBuilder

object Main extends App {
  val injector = new GuiceApplicationBuilder().overrides(new Module1).injector()
  val identifier = injector.instanceOf[BankAccountIdentifier]

  val account1 = BankAccount("123", "Savings", BigDecimal("1000.00"))
  val account2 = BankAccount("456", "Savings", BigDecimal("2000.00"))

  if (identifier.identify(account1, account2)) {
    println("The accounts have the same account number.")
  } else {
    println("The accounts have different account numbers.")
  }

  val injector2 = new GuiceApplicationBuilder().overrides(new Module2).injector()
  val identifier2 = injector2.instanceOf[BankAccountIdentifier]

  if (identifier2.identify(account1, account2)) {
    println("The accounts have the same balance.")
  } else {
    println("The accounts have different balances.")
  }
}
