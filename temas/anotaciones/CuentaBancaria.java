public class CuentaBancaria {

    @InjectDependency
    private ITransferencia transferencia;

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void transferir(double monto, CuentaBancaria cuentaDestino) {
        transferencia.transferir(this, cuentaDestino, monto);
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
