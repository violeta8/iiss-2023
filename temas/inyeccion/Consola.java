k// La clase Consola implementa la interfaz Jugable.
public class Consola implements Jugable
{
    // La clase Consola tiene un atributo privado modelo.
    private String modelo;
    
    // El constructor de la clase Consola toma un argumento modelo, que es asignado al atributo correspondiente de la instancia de Consola.
    public Consola(String modelo)
    {
        this.modelo = modelo;
    }
    
    // La clase Consola tiene un método getModelo() que devuelve el valor del atributo modelo.
    public String getModelo(String modelo)
    {
        return modelo;
    }
    
    // La clase Consola tiene un método setModelo() que permite modificar el valor del atributo modelo.
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    // La clase Consola tiene un método jugar() que imprime en la consola el mensaje "Jugando en la consola" seguido del valor del atributo modelo.
    @Override
    public void jugar()
    {
        System.out.println("Jugando en la consola " + modelo);
    }  
}