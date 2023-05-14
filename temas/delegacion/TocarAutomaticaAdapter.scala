trait SonarInterface {
  def sonar(): Unit
}

class TocarAutomaticaAdapter(tocarAutomatica: TocarAutomatica) extends SonarInterface {
  override def sonar(): Unit = {
    tocarAutomatica.sonar()
  }
}