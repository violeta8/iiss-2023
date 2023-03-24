public class BankAccountTest {

    public static void main(String[] args) {
        // Crear una cuenta bancaria con un número de cuenta dado
        BankAccount account = new BankAccount("123456");

        // Depositar 1000€ en la cuenta
        account.deposit(1000);
        System.out.println("Balance después del depósito: " + account.getBalance() + " euros");

        // Retirar 500€ de la cuenta
        account.withdraw(500);
        System.out.println("Balance después del retiro: " + account.getBalance()+ " euros");

        // Intentar retirar más dinero del que hay en la cuenta
        try {
            account.withdraw(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al retirar: " + e.getMessage()+ " euros");
        }

        // Obtener el saldo de la cuenta
        double balance = account.getBalance();
        System.out.println("Saldo de la cuenta: " + balance+ " euros");
    }

}
