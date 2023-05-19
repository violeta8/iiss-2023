import javax.inject.Inject
import javax.inject.Named

class BankAccount {
  @Inject
  @Named("transferTypeA")
  var transferComparator: TransferComparator = _

  // Other attributes

  def transfer(otherAccount: BankAccount): Unit = {
    val comparisonResult = transferComparator.compare(this, otherAccount)
    // Perform transfer based on comparison result
  }
}