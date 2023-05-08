import com.google.inject.Inject

class BankAccountComparatorImpl @Inject()() extends BankAccountComparator {
  override implicit val compareByInterestRate: Ordering[BankAccount] =
    Ordering.by(_.interestRate)

  override implicit val compareByBalance: Ordering[BankAccount] =
    Ordering.by(_.balance)

  override implicit val compareById: Ordering[BankAccount] =
    Ordering.by(_.id)
}
