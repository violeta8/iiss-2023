class Lavadora {
    private val lavadoraAutomatica: LavadoraAutomatica = new LavadoraAutomatica()
    
    def lavarRopa(): Unit = {
    lavadoraAutomatica.lavar()
    }
}