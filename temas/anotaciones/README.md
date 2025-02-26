# Anotación personalizada @InjectDependency

En primer lugar, se define una anotación personalizada llamada @InjectDependency. Esta anotación se utiliza para marcar los campos que necesitan inyección de dependencias en tiempo de ejecución. 
```java	
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectDependency {
}
```
La anotación se aplica a campos (ElementType.FIELD) y se retiene en tiempo de ejecución (RetentionPolicy.RUNTIME).

# Clase CuentaBancaria
La clase CuentaBancaria representa una cuenta bancaria y tiene un campo para la implementación de ITransferencia que necesita inyección de dependencias en tiempo de ejecución.
```java
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
```

La clase tiene un constructor que toma un parámetro saldoInicial para establecer el saldo inicial de la cuenta. La clase también tiene métodos para realizar transferencias, depósitos y retiros, y para obtener el saldo actual.

# Interfaz ITransferencia y sus implementaciones
La interfaz ITransferencia define un método transferir que se utiliza para transferir dinero entre dos cuentas bancarias.
```java
public interface ITransferencia {

    void transferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto);
}
```

La interfaz tiene dos implementaciones: TransferenciaLocal y TransferenciaRemota. La implementación TransferenciaLocal realiza transferencias entre cuentas bancarias locales.

```java
public class TransferenciaLocal implements ITransferencia {

    @Override
    public void transferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto) {
        cuentaOrigen.retirar(monto);
        cuentaDestino.depositar(monto);
    }
}
```

La implementación TransferenciaRemota realiza transferencias entre cuentas bancarias remotas.

# Clase principal Main
La clase principal Main crea una instancia de CuentaBancaria y utiliza la inyección de dependencias en tiempo de ejecución para definir la implementación de ITransferencia que se utilizará.

```java
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

```