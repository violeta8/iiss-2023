class Perro(nombre: String, edad: Int, val raza: String) extends Animal(nombre, edad) {
    def ladrar(): Unit = {
    println("Guau guau!")
    }
}