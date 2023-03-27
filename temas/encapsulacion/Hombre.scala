 case class Hombre(nombre: String, edad: Int) extends Persona(nombre, edad, 'H') {
  // código de la clase Hombre
  def presentarse(): String = s"Hola, mi nombre es ${nombre} y tengo $edad años."
}
