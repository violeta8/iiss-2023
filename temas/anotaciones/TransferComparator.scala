import javax.inject.Named

trait TransferComparator {
  def compare(a: BankAccount, b: BankAccount): Int
}

@Named("transferTypeA")
class TransferComparatorA extends TransferComparator {
  override def compare(a: BankAccount, b: BankAccount): Int = {
    // Compare based on TransferTypeA logic
    // Return -1 if a < b, 0 if a == b, 1 if a > b
    ???
  }
}

@Named("transferTypeB")
class TransferComparatorB extends TransferComparator {
  override def compare(a: BankAccount, b: BankAccount): Int = {
    // Compare based on TransferTypeB logic
    // Return -1 if a < b, 0 if a == b, 1 if a > b
    ???
  }
}
