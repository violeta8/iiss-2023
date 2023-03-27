object Main {
  def main(args: Array[String]): Unit = {
    val hombre = Hombre("Juan", 30)
    val mujer = Mujer("Maria", 25)

    println(hombre.presentarse())
    println(mujer.presentarse())

    hombre.edad += 1
    mujer.edad += 1

    println(hombre)
    println(mujer)

    hombre.edad_=(35)
    mujer.edad_=(30)

    println(hombre)
    println(mujer)
  }
}
