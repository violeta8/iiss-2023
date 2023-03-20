public class Persona {

    private String nombre;
    private int edad;
    private char genero;
  
    // Constructor
    public Persona(String nombre, int edad, char genero) {
      this.nombre = nombre;
      this.edad = edad;
      this.genero = genero;
    }
  
    // Métodos de acceso (getters)
    public String getNombre() {
      return nombre;
    }
  
    public int getEdad() {
      return edad;
    }
  
    public char getGenero() {
      return genero;
    }
  
    // Métodos de modificación (setters)
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
  
    public void setEdad(int edad) {
      this.edad = edad;
    }
  
    public void setGenero(char genero) {
      this.genero = genero;
    }
  }
  