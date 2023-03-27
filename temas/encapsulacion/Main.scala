object Main {
  def main(args: Array[String]): Unit = {
    val hombre: Hombre = Hombre("Juan", 30)
    val mujer: Mujer = Mujer("Maria", 25)

    println(hombre.presentarse())
    println(mujer.presentarse())

    val hombreMayor = hombre.envejecer()
    val mujerMayor = mujer.envejecer()

    println(hombreMayor.presentarse())
    println(mujerMayor.presentarse())
  }
}