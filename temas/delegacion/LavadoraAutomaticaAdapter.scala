trait LavadoraInterface {
  def lavar(): Unit
}

class LavadoraAutomaticaAdapter(lavadoraAutomatica: LavadoraAutomatica) extends LavadoraInterface {
  override def lavar(): Unit = {
    lavadoraAutomatica.lavar()
  }
}