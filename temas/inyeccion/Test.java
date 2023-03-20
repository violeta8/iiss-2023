public class Test 
{
    public static void main(String[] args)
    {
        Jugador jugador = new Jugador("Juan",new Consola("Xbox"));
        jugador.jugar();
        jugador = new Jugador("Pedro",new PC("ordenador"));
        jugador.jugar();
    }    
}
