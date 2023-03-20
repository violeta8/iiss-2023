public class Jugador implements Jugable
{
    // Atributos
    private String nombre; // Nombre del jugador
    private Jugable dispositivo; // Dispositivo para jugar
    
    // Constructor
    public Jugador(String nombre, Jugable dispositivo)
    {
        // Inicialización de atributos
        this.nombre = nombre; // Inicialización del nombre
        this.dispositivo = dispositivo; // Inicialización del dispositivo
    }
    
    // Implementación del método jugar de la interfaz Jugable
    public void jugar()
    {
        dispositivo.jugar(); // Llamada al método jugar del dispositivo
    }
}