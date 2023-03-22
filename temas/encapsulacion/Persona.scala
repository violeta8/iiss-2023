class Persona(private var nombre: String, private var edad: Int, private var genero: Char) {

  // Métodos de acceso (getters)
  def getNombre(): String = nombre
  
  def getEdad(): Int = edad
  
  def getGenero(): Char = genero
  
  // Métodos de modificación (setters)
  def setNombre(nombre: String): Unit = {
    this.nombre = nombre
  }
  
  def setEdad(edad: Int): Unit = {
    this.edad = edad
  }
  
  def setGenero(genero: Char): Unit = {
    this.genero = genero
  }
}
