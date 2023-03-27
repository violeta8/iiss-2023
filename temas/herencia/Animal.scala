trait HacerSonido {
  def hacerSonido(): Unit = {
    println("Haciendo sonido...")
  }
}

trait Correr {
  def correr(): Unit = {
    println("Corriendo...")
  }
}
class Animal(val nombre: String, val edad: Int) 