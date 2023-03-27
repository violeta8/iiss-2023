Primero, se define una clase abstracta Persona con dos campos: nombre, que es un valor de cadena, y edad, que es un valor entero mutable. La clase es abstracta, lo que significa que no se puede crear una instancia directa de ella, sino que debe ser extendida por clases concretas.

```scala
abstract class Persona(val nombre: String, var edad: Int) {
  type T <: Persona
  def presentarse(): String
  def envejecer(): T
}
```

Luego, se definen dos clases Hombre y Mujer que extienden la clase abstracta Persona y definen el tipo T como ellos mismos. Además, cada clase define su propio método presentarse() que utiliza los campos nombre y edad de la clase para imprimir una presentación personalizada.

```scala
case class Hombre(override val nombre: String,  var e: Int) extends Persona(nombre, e) {
  type T = Hombre
  
  def presentarse(): String = s"Hola, mi nombre es $nombre y tengo $edad años."
  def envejecer(): Hombre = Hombre(nombre, edad + 1)

}

case class Mujer(override val nombre: String,  var e: Int) extends Persona(nombre, e) {
  type T = Mujer
  
  def presentarse(): String = s"Hola, soy $nombre y tengo $edad años."
  def envejecer(): Mujer = Mujer(nombre, edad + 1)
}
```

En el método main, se crean instancias de Hombre y Mujer y se utilizan los métodos presentarse() para imprimir información sobre ellos. Luego, se llama al método envejecer() de cada instancia, lo que aumenta su edad en uno. Finalmente, se llama al método presentarse() nuevamente para imprimir la información actualizada.

```scala
object Main {
  def main(args: Array[String]): Unit = {
    val hombre: Hombre = Hombre("Juan", 30)
    val mujer: Mujer = Mujer("Maria", 25)

    println(hombre.presentarse())
    println(mujer.presentarse())

    val hombreMayor = hombre.envejecer()
    val mujerMayor = mujer.envejecer()

    println(hombreMayor.presentarse())
    println(mujerMayor.presentarse())
  }
}
```

El uso de un campo abstracto T permite que las clases Hombre y Mujer se referencien a sí mismas dentro de su propia definición, lo que permite definir métodos como envejecer que trabajan con instancias de su mismo tipo. Esto hace que el código sea más flexible y fácil de mantener, ya que no se necesitan definir métodos separados para cada tipo de persona. Además, el uso de clases case permite una implementación más concisa de las clases, lo que hace que el código sea más fácil de leer y entender.