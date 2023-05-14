object Main extends App {
  implicit val TocarAutomaticaAdapter: TocarAutomaticaAdapter = new TocarAutomaticaAdapter(new TocarAutomatica())
  val instrumento = new Instrumento

  println("Iniciando instrumento...")
  instrumento.tocarInstrumento()
  println("Instrumento ha completado su rutina.")
}
