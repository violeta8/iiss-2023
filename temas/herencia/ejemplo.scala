object ejemplo {
    def main(args: Array[String]): Unit = {
    val miAnimal = new Animal("Mimi", 2)
    val miPerro = new Perro("Fido", 3, "Labrador")
    miAnimal.hacerSonido()
    miPerro.hacerSonido()
    miPerro.ladrar()
    }
}