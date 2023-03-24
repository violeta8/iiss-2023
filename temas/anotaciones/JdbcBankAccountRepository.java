public class JdbcBankAccountRepository implements BankAccountRepository {

    private final JdbcTemplate jdbcTemplate;

    @Inject
    public JdbcBankAccountRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public BankAccount findByAccountNumber(String accountNumber) {
        String sql = "SELECT * FROM bank_accounts WHERE account_number = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{accountNumber}, new BeanPropertyRowMapper<>(BankAccount.class));
    }

    @Override
    public void save(BankAccount account) {
        String sql = "UPDATE bank_accounts SET balance = ? WHERE account_number = ?";
        jdbcTemplate.update(sql, account.getBalance(), account.getAccountNumber());
    }
}
