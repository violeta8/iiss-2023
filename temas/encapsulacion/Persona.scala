abstract class Persona(val nombre: String, var edad: Int) {
  type T <: Persona
  def presentarse(): String
  def envejecer(): T
}

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