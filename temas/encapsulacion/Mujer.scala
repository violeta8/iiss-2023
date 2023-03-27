
 case class Mujer( nombre: String, edad: Int) extends Persona(nombre, edad, 'M') {
  def presentarse(): String = s"Hola, soy $nombre y tengo $edad años."
}