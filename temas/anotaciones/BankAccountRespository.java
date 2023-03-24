 interface BankAccountRepository {
    BankAccount findByAccountNumber(String accountNumber);
    void save(BankAccount account);
}
