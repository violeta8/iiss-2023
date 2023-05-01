## Descripción del código

El código anterior es un programa en Scala que permite al usuario introducir dos números enteros y una edad desde la consola. Luego, utiliza la biblioteca del lenguaje, incluyendo `Option`, `Some`, `None`, `Either`, `Left` y `Right`, para calcular el resultado de la división y validar la edad introducida por el usuario. Finalmente, imprime los resultados en la consola.

A continuación se muestra una descripción detallada del código: 
1. Primero, importamos la biblioteca `scala.io.StdIn` para poder leer los datos introducidos por el usuario desde la consola. También definimos un objeto `Main` que extiende de `App` para poder ejecutar el programa sin necesidad de definir un método `main`.

```scala
import scala.io.StdIn

object Main extends App {
  // Aquí irá el código del programa
}
``` 
2. Luego, pedimos al usuario que introduzca el dividendo y el divisor utilizando la función `StdIn.readInt()` de la biblioteca estándar de Scala. Estos valores se almacenan en las variables `dividendo` y `divisor`.

```scala
println("Introduce el dividendo:")
val dividendo = StdIn.readInt()

println("Introduce el divisor:")
val divisor = StdIn.readInt()
``` 
3. A continuación, definimos una función `dividir` que toma el dividendo y el divisor como argumentos y devuelve un `Option[Int]`. Si el divisor es cero, la función devuelve `None`. De lo contrario, la función calcula el resultado de la división y lo devuelve dentro de un `Some`.

```scala
def dividir(dividendo: Int, divisor: Int): Option[Int] = {
  if (divisor == 0) None else Some(dividendo / divisor)
}
``` 
4. Utilizamos la función `dividir` para calcular el resultado de la división y almacenarlo en la variable `resultado`.

```scala
val resultado = dividir(dividendo, divisor)
``` 
5. Finalmente, imprimimos el resultado utilizando el operador `match` y el tipo `Option`. Si `resultado` es `Some`, imprimimos el resultado calculado. Si `resultado` es `None`, imprimimos un mensaje de error indicando que no se puede dividir entre cero.

```scala
resultado match {
  case Some(r) => println(s"El resultado es $r")
  case None => println("No se puede dividir entre cero")
}
``` 
6. A continuación, pedimos al usuario que introduzca su edad utilizando la función `StdIn.readInt()`.

```scala
println("Introduce la edad:")
val edad = StdIn.readInt()
``` 
7. Definimos una función `validarEdad` que toma la edad como argumento y devuelve un `Either[String, Int]`. Si la edad es menor de 18 años, la función devuelve `Left` con un mensaje de error indicando que la persona es menor de edad. De lo contrario, la función devuelve `Right` con la edad introducida.

```scala
def validarEdad(edad: Int): Either[String, Int] = {
  if (edad <Left("La persona es menor de edad") else Right(edad))
}
```

8. Utilizamos la función `validarEdad` para validar la edad introducida por el usuario y almacenar el resultado en la variable `resultadoEdad`.

```scala
val resultadoEdad = validarEdad(edad)
```

 
1. Finalmente, imprimimos el resultado utilizando el operador `match` y el tipo `Either`. Si `resultadoEdad` es `Right`, imprimimos un mensaje indicando que la edad es válida y la edad introducida. Si `resultadoEdad` es `Left`, imprimimos un mensaje de error indicando que la persona es menor de edad.

```scala
resultadoEdad match {
  case Right(edadValida) => println(s"La edad introducida es $edadValida")
  case Left(mensajeError) => println(mensajeError)
}
```
## Instrucciones para construir, compilar y probar

Aquí te explicamos cómo construir, compilar y probar el código anterior:
### Requisitos 
- Tener instalado Scala en tu ordenador. Puedes descargarlo desde la página oficial de Scala: [https://www.scala-lang.org/download/](https://www.scala-lang.org/download/)
### Pasos 
1. Abre un editor de texto o un IDE para Scala, como IntelliJ IDEA o Eclipse. 
2. Crea un nuevo archivo llamado `Main.scala` y copia y pega el código anterior en él. 
3. Guarda el archivo en la carpeta que desees. 
4. Abre la terminal o el símbolo del sistema en tu ordenador y navega hasta la carpeta donde guardaste el archivo `Main.scala`. 
5. Ejecuta el siguiente comando para compilar el código:

```bash
scalac Main.scala
```

Este comando compila el código y genera un archivo `.class` para cada objeto y clase definidos en el archivo. 
6. Ejecuta el siguiente comando para ejecutar el programa:

```bash
scala Main
```

Este comando ejecuta el objeto `Main` y muestra el mensaje "Introduce el dividendo:" en la consola. 
7. Introduce el dividendo, el divisor y la edad cuando se te solicite en la consola y presiona Enter después de cada entrada. 
8. El programa calculará el resultado de la división y validará la edad introducida por el usuario. 
9. El programa mostrará el resultado de la división o un mensaje de error si no se puede dividir entre cero. También mostrará la edad introducida o un mensaje de error si la persona es menor de edad. 