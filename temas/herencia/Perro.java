public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); //se necesita como primera instruccion ya que debe ejecutarse antes de que se puedan inicializar los atributos de 'Perro'
        this.raza = raza;
    }
    
    public void ladrar() {
        System.out.println("Guau guau!");
    }
}
