// La clase PC implementa la interfaz Jugable.
public class PC implements Jugable
{
    // La clase PC tiene un atributo privado modelo.
    private String modelo;
    
    // El constructor de la clase PC toma un argumento modelo, que es asignado al atributo correspondiente de la instancia de PC.
    public PC(String modelo)
    {
        this.modelo = modelo;
    }    
    
    // La clase PC tiene un método jugar() que imprime en la consola el mensaje "Jugando en la PC" seguido del valor del atributo modelo.
    @Override
    public void jugar()
    {
        System.out.println("Jugando en la PC " + modelo);
    }
}
