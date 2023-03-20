public class ejemplo {

    public static void main(String[] args) {
      // Crear una instancia de la clase Persona
      Persona persona1 = new Persona("Juan", 25, 'M');
  
      // Obtener los valores de los atributos de la clase Persona
      System.out.println("Nombre: " + persona1.getNombre());
      System.out.println("Edad: " + persona1.getEdad());
      System.out.println("Género: " + persona1.getGenero());
  
      // Modificar el valor del atributo "nombre"
      persona1.setNombre("Tu padre");
  
      // Obtener el valor actualizado del atributo "nombre"
      System.out.println("Nombre actualizado: " + persona1.getNombre());
    }
  }
  