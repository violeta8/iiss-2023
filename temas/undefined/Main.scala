import scala.io.StdIn

object Main extends App {
  // Pedimos al usuario que introduzca los números de entrada
  println("Introduce el dividendo:")
  val dividendo = StdIn.readInt()

  println("Introduce el divisor:")
  val divisor = StdIn.readInt()

  // Definimos una función que toma un número entero y devuelve un Option[Int]
  def dividir(dividendo: Int, divisor: Int): Option[Int] = {
    if (divisor == 0) None else Some(dividendo / divisor)
  }

  // Utilizamos la función dividir para calcular el resultado de la división
  val resultado = dividir(dividendo, divisor)

  // Imprimimos el resultado utilizando el operador match y el tipo Option
  resultado match {
    case Some(r) => println(s"El resultado es $r")
    case None => println("No se puede dividir entre cero")
  }

  // Pedimos al usuario que introduzca la edad
  println("Introduce la edad:")
  val edad = StdIn.readInt()

  // Definimos otra función que toma un número entero y devuelve un Either[String, Int]
  def validarEdad(edad: Int): Either[String, Int] = {
    if (edad < 18) Left("La persona es menor de edad") else Right(edad)
  }

  // Utilizamos la función validarEdad para validar la edad introducida por el usuario
  validarEdad(edad) match {
    case Right(e) => println(s"La edad $e es válida")
    case Left(mensaje) => println(mensaje)
  }
}
