import com.google.inject.Inject
trait BankAccountComparator extends Ordering[BankAccount]{
  implicit val compareByInterestRate: Ordering[BankAccount]
  implicit val compareByBalance: Ordering[BankAccount]
  implicit val compareById: Ordering[BankAccount]
}
