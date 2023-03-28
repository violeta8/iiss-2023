object Main extends App {

  // Ejemplo de uso de la función getOperatingSystems
  val devices = List(
    MobileDevice("Samsung", "Galaxy S20", Some("Android")),
    MobileDevice("Apple", "iPhone 12", Some("iOS")),
    MobileDevice("OnePlus", "8T", None),
    MobileDevice("Google", "Pixel 5", Some("Android"))
  )

  val operatingSystems = getOperatingSystems(devices)
  println(operatingSystems.mkString(", "))
}
