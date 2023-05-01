# EXPLICACIÓN DEL EJEMPLO DE INYECCIÓN DE DEPENDENCIAS EN SCALA:
En el ejemplo de identificación de cuentas bancarias, se definió una clase BankAccount con los atributos necesarios, como el número de cuenta, el tipo de cuenta y el saldo. Luego se creó un trait llamado BankAccountComparator para comparar cuentas bancarias utilizando diferentes criterios de comparación.

```scala
case class BankAccount(accountNumber: String, accountType: String, balance: BigDecimal)
```

Se implementaron diferentes comparadores que extienden el trait BankAccountComparator, y se configuraron los módulos de Play para que utilicen diferentes comparadores. Por ejemplo, se creó un comparador que compara cuentas por el número de cuenta.

```scala
trait BankAccountComparator {
   def compare(account1: BankAccount, account2: BankAccount): Boolean
}

class AccountNumberComparator extends BankAccountComparator {
   def compare(account1: BankAccount, account2: BankAccount): Boolean = {
      account1.accountNumber == account2.accountNumber
   }
}
```

Se usa el BankAccountModule que utiliza en el framework Guice de Java para configurar la inyección de dependencias. En este caso, se utiliza en el contexto del framework Play de Scala para indicar qué objeto implementa la interfaz BankAccountComparator que se utilizará en la aplicación.

En la clase BankAccountModule, se utiliza el método configure() para enlazar la implementación de la interfaz BankAccountComparator con una clase concreta que implementa ese comportamiento. En el ejemplo, se enlaza la interfaz BankAccountComparator con la clase concreta AccountNumberComparator.

Cuando se crea una instancia de la clase BankAccountIdentifier utilizando el framework Play, se le proporciona una implementación de la interfaz BankAccountComparator a través de la inyección de dependencias. En este caso, el framework Play utiliza la configuración definida en la clase BankAccountModule para determinar qué implementación de la interfaz BankAccountComparator se debe utilizar. Esto permite que el comportamiento de la clase BankAccountIdentifier se pueda cambiar simplemente al enlazar una implementación diferente de la interfaz BankAccountComparator.

```scala
import com.google.inject.AbstractModule

class BankAccountModule extends AbstractModule {
   override def configure(): Unit = {
      bind(classOf[BankAccountComparator]).to(classOf[AccountNumberComparator])
   }
}
```

Luego se creó una clase BankAccountIdentifier que utiliza la inyección de dependencias de Play para poder utilizar diferentes comparadores. En la clase BankAccountIdentifier, se define un constructor que toma un objeto BankAccountComparator y un método identify que utiliza el comparador para comparar dos cuentas bancarias.

```scala
import javax.inject.Inject

class BankAccountIdentifier @Inject() (comparator: BankAccountComparator) {
   def identify(account1: BankAccount, account2: BankAccount): Boolean = {
      comparator.compare(account1, account2)
   }
}
```

Finalmente, se creó una instancia de BankAccountIdentifier utilizando Play, y se utilizaron los diferentes comparadores para identificar cuentas bancarias utilizando diferentes criterios de comparación.

En resumen, la inyección de dependencias permite que los objetos dependan de otros objetos sin tener que conocer la implementación de esos objetos. En Scala, esto se puede lograr utilizando el framework Play y configurando los módulos de Play para que utilicen diferentes objetos dependientes.

## EJECUCIÓN DEL EJEMPLO

Para ejecutar el main, ya que es un proyecto maven necesitamos ejecutar el pom.xml, para ello nos vamos a la carpeta donde se encuentra el pom.xml y ejecutamos el siguiente comando:
Abre una terminal y navega hasta el directorio raíz de tu proyecto Maven.

Ejecuta el siguiente comando para compilar el proyecto y generar el archivo JAR:
```bash
mvn clean package
```

Este comando compila el código fuente y empaqueta la aplicación en un archivo JAR en la carpeta "target" del proyecto.

Una vez que el archivo JAR ha sido generado, puedes ejecutar la aplicación utilizando el siguiente comando:
```bash
java -cp target/nombre-del-archivo-jar.jar com.example.Main
```

Asegúrate de reemplazar "nombre-del-archivo-jar.jar" con el nombre del archivo JAR generado y "nombre-del-paquete" con el nombre del paquete que contiene tu clase Main.

Este comando ejecuta la clase Main y muestra la salida en la consola.

Si deseas probar la inyección de dependencias de distintas implementaciones de la interfaz BankAccountComparator, simplemente modifica la configuración en el archivo BankAccountModule.scala y ejecuta de nuevo el comando "mvn clean package" seguido del comando "java -cp target/nombre-del-archivo-jar.jar nombre-del-paquete.Main".

Por ejemplo, para inyectar la implementación BankAccountTypeComparator en lugar de la implementación AccountNumberComparator, puedes cambiar la línea en el método configure() del archivo BankAccountModule.scala de:
```bash
bind(classOf[BankAccountComparator]).to(classOf[AccountNumberComparator])
```
a:
```bash
bind(classOf[BankAccountComparator]).to(classOf[BankAccountTypeComparator])
```

Luego, vuelve a ejecutar el comando "mvn clean package" seguido del comando "java -cp target/nombre-del-archivo-jar.jar nombre-del-paquete.Main" para ver el resultado de la inyección de dependencias con la nueva implementación.