import com.google.inject.AbstractModule

case class BankAccount(accountNumber: String, accountType: String, balance: BigDecimal)
class Module1 extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[BankAccountComparator]).to(classOf[AccountNumberComparator])
  }
}

class Module2 extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[BankAccountComparator]).to(classOf[BalanceComparator])
  }
}