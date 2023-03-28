  // Función que recibe una lista de dispositivos móviles y devuelve una lista de sistemas operativos
  def getOperatingSystems(devices: List[MobileDevice]): List[String] = {
    devices.flatMap(_.os)
  }