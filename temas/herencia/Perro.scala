class Perro(nombre: String, edad: Int, val raza: String) extends Animal(nombre, edad) with HacerSonido with Correr{
    def ladrar(): Unit = {
    println("Guau guau!")
    }
}