
@Autor(nombre="Juan Perez", fecha="14 de marzo de 2023")
public class MiClase 
{
    private String nombre;
    private String apellido;
    
    public MiClase(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // métodos getter y setter para los atributos de la clase
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
