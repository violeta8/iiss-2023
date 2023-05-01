class AccountNumberComparator extends BankAccountComparator {
   def compare(account1: BankAccount, account2: BankAccount): Boolean = {
      account1.accountNumber == account2.accountNumber
   }
}

