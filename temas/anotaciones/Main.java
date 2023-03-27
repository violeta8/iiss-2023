import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);

        // Inyección de dependencias en tiempo de ejecución
        ITransferencia transferencia = new TransferenciaLocal();
        inyectarDependencias(cuenta1, transferencia);

        CuentaBancaria cuenta2 = new CuentaBancaria(500);

        cuenta1.transferir(200, cuenta2);

        System.out.println("Saldo cuenta 1: " + cuenta1.getSaldo()); // Debería ser 800
        System.out.println("Saldo cuenta 2: " + cuenta2.getSaldo()); // Debería ser 700
    }

    private static void inyectarDependencias(CuentaBancaria cuentaBancaria, ITransferencia transferencia) {
        Field[] fields = cuentaBancaria.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectDependency.class)) {
                try {
                    field.setAccessible(true);
                    field.set(cuentaBancaria, transferencia);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
