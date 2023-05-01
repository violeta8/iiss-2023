El archivo `Main.scala` contiene el programa principal que le pide al usuario que introduzca un número y luego calcula la suma de los cuadrados de los primeros números enteros utilizando programación asíncrona. Aquí está el código completo:

```scala
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.StdIn

object Main extends App {
  val asyncSum = new AsyncSum()

  println("Enter a number to calculate the consecutive sum of the squares:");

  // Leer el número desde la entrada estándar
  val n = StdIn.readInt()

  val futureSum = asyncSum.sumOfSquares(n)

  futureSum.foreach(sum => println(s"Sum of squares of first $n numbers: $sum"))

  // Esperar hasta que se complete el futuro antes de finalizar el programa
  val result = Await.result(futureSum, 5.seconds)
  println(s"Result: $result")
}
```



## Aquí está una descripción detallada del código: 
1. `import scala.concurrent.Await` - Importamos la clase `Await` de la biblioteca `scala.concurrent`, que nos permitirá esperar a que se complete el futuro. 
2. `import scala.concurrent.duration._` - Importamos la clase `Duration` de la biblioteca `scala.concurrent.duration`, que nos permitirá especificar un tiempo límite de espera. 
3. `import scala.concurrent.ExecutionContext.Implicits.global` - Importamos el objeto `global` de la clase `ExecutionContext` de la biblioteca `scala.concurrent`, que nos proporciona un contexto de ejecución global para nuestros futuros. 
4. `import scala.io.StdIn` - Importamos la clase `StdIn` de la biblioteca `scala.io`, que nos permitirá leer la entrada estándar. 
5. `object Main extends App` - Definimos un objeto `Main` que extiende la clase `App`. Esto nos permite escribir nuestro programa principal en el cuerpo del objeto `Main` sin tener que escribir un método `main`. 
6. `val asyncSum = new AsyncSum()` - Creamos una instancia de la clase `AsyncSum`, que definimos en otro archivo. 
7. `print("Enter a number: ")` - Imprimimos el mensaje "Enter a number: " en la consola para pedir al usuario que introduzca un número. 
8. `val n = StdIn.readInt()` - Leemos un número entero desde la entrada estándar y lo asignamos a la variable `n`. 
9. `val futureSum = asyncSum.sumOfSquares(n)` - Invocamos el método `sumOfSquares` de la instancia `asyncSum` para calcular la suma de los cuadrados de los primeros `n` números de forma asíncrona. Esto devuelve un futuro de tipo `Future[Int]`. 
10. `futureSum.foreach(sum => println(s"Sum of squares of first $n numbers: $sum"))` - Registramos un callback en el futuro `futureSum` para imprimir la suma de los cuadrados cuando se complete. 
11. `val result = Await.result(futureSum, 5.seconds)` - Esperamos hasta que se complete el futuro `futureSum` y asignamos el resultado a la variable `result`. Especificamos un tiempo límite de espera de 5 segundos utilizando la constante `5.seconds`, que importamos en la línea 2.
12. `println(s"Result: $result")` - Imprimimos el resultado en la consola.

El programa utiliza la clase `AsyncSum` definida en otro archivo para realizar el cálculo de forma asíncrona. Aquí está el código completo de la clase `AsyncSum`:

```scala
import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global

class AsyncSum {
  def sumOfSquares(n: Int): Future[Int] = {
    val promise = Promise[Int]()
    val futureSum = promise.future

    // Ejecutar el cálculo de forma asíncrona en un hilo separado
    Future {
      var sum = 0
      for (i <- 1 to n) {
        sum += i * i
        Thread.sleep(10) // Simular un cálculo lento
      }
      promise.success(sum)
    }

    futureSum
  }
}
```

## Instrucciones para construir, compilar y probar el programa:
1. Abre un editor de texto o un entorno de desarrollo integrado (IDE) que admita Scala, como IntelliJ IDEA, Visual Studio Code con el plugin Scala, o Eclipse con el plugin Scala. 
2. Crea un nuevo proyecto de Scala y crea un archivo `Main.scala`. 
3. Copia y pega el código del programa principal en el archivo `Main.scala`. 
4. Crea un archivo `AsyncSum.scala` en el mismo directorio y copia y pega el código de la clase `AsyncSum`.
5. Guarda ambos archivos y compila el proyecto.
6. Cuando se ejecute el programa, aparecerá un mensaje que pide al usuario que introduzca un número: `Enter a number:`. 
7. El usuario deberá introducir un número entero y presionar la tecla `Enter`. 
8. El programa calculará la suma de los cuadrados de los números del 1 al número introducido por el usuario de forma asíncrona utilizando la clase `AsyncSum`.
9. Después de 5 segundos de espera, el resultado de la suma se imprimirá en la consola.

##  probar el programa, sigue estos pasos:
1. Abre una terminal o una línea de comandos en tu sistema operativo. 
2. Navega hasta el directorio donde guardaste los archivos `Main.scala` y `AsyncSum.scala`. 
3. Compila el programa utilizando el siguiente comando: `scalac Main.scala AsyncSum.scala` 
4. Ejecuta el programa utilizando el siguiente comando: `scala Main` 
5. Cuando se te pida, introduce un número entero y presiona la tecla `Enter`.
6. Espera 5 segundos a que se calcule la suma de los cuadrados.
7. El resultado de la suma se imprimirá en la consola.