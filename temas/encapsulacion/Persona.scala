class Persona(private var _nombre: String, private var _edad: Int, private var _genero: Char) {
  def nombre: String = _nombre

  def edad: Int = _edad

  def genero: Char = _genero

  def nombre_=(nuevoNombre: String): Unit = {
    _nombre = nuevoNombre
  }

  def edad_=(nuevaEdad: Int): Unit = {
    _edad = nuevaEdad
  }

  def genero_=(nuevoGenero: Char): Unit = {
    _genero = nuevoGenero
  }
}