class Gato(nombre: String, edad: Int, val raza: String) extends Animal(nombre, edad) with HacerSonido with Correr {
  def maullar(): Unit = {
    println("Miau!")
  }
}