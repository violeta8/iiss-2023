public class BankAccountRepositoryImp implements BankAccountRepository {

    private final BankAccountRepository accountRepository;

    @Inject
    public BankAccountImpl(BankAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public BankAccount createAccount(String accountNumber) {
        BankAccount account = new BankAccount(accountNumber);
        this.accountRepository.save(account);
        return account;
    }

    @Override
    @Transactional
    public void transferMoney(String sourceAccountNumber, String destinationAccountNumber, double amount) {
        BankAccount sourceAccount = this.accountRepository.findByAccountNumber(sourceAccountNumber);
        BankAccount destinationAccount = this.accountRepository.findByAccountNumber(destinationAccountNumber);
        if (sourceAccount.getBalance() < amount) {
            throw new InsufficientFundsException("Saldo insuficiente en la cuenta de origen");
        }
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
        this.accountRepository.save(sourceAccount);
        this.accountRepository.save(destinationAccount);
    }
}
