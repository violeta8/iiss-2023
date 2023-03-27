import com.google.inject.AbstractModule

class BankAccountModule extends AbstractModule {
   override def configure(): Unit = {
      bind(classOf[BankAccountComparator]).to(classOf[AccountNumberComparator])
   }
}
