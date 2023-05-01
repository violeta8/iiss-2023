import javax.inject.Inject

class BankAccountIdentifier @Inject() (comparator: BankAccountComparator) {
   def identify(account1: BankAccount, account2: BankAccount): Boolean = {
      comparator.compare(account1, account2)
   }
}