
public class Lavadora{
    private LavadoraAutomatica LavadoraAutomatica;
    
    public Lavadora() {
        this.LavadoraAutomatica = new LavadoraAutomatica();
    }
    
    public void lavarRopa() {
        LavadoraAutomatica.lavar();
    }
}