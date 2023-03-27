object Main extends App {
  implicit val lavadoraAutomaticaAdapter: LavadoraAutomaticaAdapter = new LavadoraAutomaticaAdapter(new LavadoraAutomatica())
  val lavadora = new Lavadora

  println("Iniciando lavado...")
  lavadora.lavarRopa()
  println("Lavado completado.")
}
