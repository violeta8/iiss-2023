public class TransferenciaLocal implements ITransferencia {

    @Override
    public void transferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto) {
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
    }
}