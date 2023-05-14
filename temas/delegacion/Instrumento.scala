implicit val tocarAutomaticaAdapter: TocarAutomaticaAdapter = new TocarAutomaticaAdapter(new TocarAutomatica())

class Instrumento(implicit instrumento: SonarInterface) {
  def tocarInstrumento(): Unit = {
    instrumento.sonar()
  }
}