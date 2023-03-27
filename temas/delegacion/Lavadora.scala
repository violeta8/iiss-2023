implicit val lavadoraAutomaticaAdapter: LavadoraAutomaticaAdapter = new LavadoraAutomaticaAdapter(new LavadoraAutomatica())

class Lavadora(implicit lavadora: LavadoraInterface) {
  def lavarRopa(): Unit = {
    lavadora.lavar()
  }
}