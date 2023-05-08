object Main extends App {
    import BankAccountComparator._
  
    val accounts = List(
      BankAccount("001", 7000.0, 0.02),
      BankAccount("005", 2000.0, 0.03),
      BankAccount("003", 3000.0, 0.01)
    )
  
    val sortedByInterestRate = accounts.sorted(compareByInterestRate)
    println("Sorted by interest rate:")
    sortedByInterestRate.foreach(println)
  
    val sortedByBalance = accounts.sorted(compareByBalance)
    println("Sorted by balance:")
    sortedByBalance.foreach(println)
  
    val sortedById = accounts.sorted(compareById)
    println("Sorted by ID:")
    sortedById.foreach(println)
  }
  