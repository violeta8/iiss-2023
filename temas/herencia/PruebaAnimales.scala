object PruebaAnimales {
  def main(args: Array[String]): Unit = {
    val perro = new Perro("Fido", 3, "Bulldog")
    println(s"Nombre: ${perro.nombre}, Edad: ${perro.edad}, Raza: ${perro.raza}")
    perro.hacerSonido()
    perro.ladrar()

    val gato = new Gato("Minina", 2, "Siamés")
    println(s"Nombre: ${gato.nombre}, Edad: ${gato.edad}, Raza: ${gato.raza}")
    gato.hacerSonido()
    gato.maullar()
    gato.correr()
  }
}