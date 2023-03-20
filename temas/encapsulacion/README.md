Supongamos que queremos crear una clase "Persona" que tenga los siguientes atributos: nombre, edad y género. Para asegurarnos de que estos atributos sean modificados y accedidos de manera adecuada, aplicaremos el principio de encapsulación. El cual intenta lograr un código más robusto y mantenible, ya que al ocultar la complejidad interna de un objeto, se pueden realizar cambios en su implementación sin afectar al resto del programa. Además, la encapsulación ayuda a prevenir errores y garantiza la integridad de los datos al controlar el acceso y la manipulación de los mismos.

```java 
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
```

En este ejemplo: 
Primero, se define la clase "Persona" con tres atributos: "nombre", "edad" y "género". Estos atributos se han declarado como privados mediante el uso del modificador "private". Esto significa que solo se pueden acceder a ellos desde dentro de la clase "Persona".

A continuación, se han definido tres métodos públicos llamados "getNombre()", "getEdad()" y "getGenero()". Estos métodos se conocen como "getters" y se utilizan para acceder a los atributos privados de la clase desde fuera de la misma. Cada método simplemente devuelve el valor del atributo correspondiente.

También se han definido tres métodos públicos llamados "setNombre()", "setEdad()" y "setGenero()". Estos métodos se conocen como "setters" y se utilizan para modificar los valores de los atributos privados de la clase desde fuera de la misma. Cada método toma un parámetro y lo utiliza para actualizar el valor del atributo correspondiente.

Finalmente, se ha definido un constructor público para la clase "Persona" que toma tres parámetros ("nombre", "edad" y "género") y los utiliza para inicializar los atributos correspondientes de la clase.

En conjunto, estos elementos forman un ejemplo básico de cómo se puede aplicar el principio de encapsulación en Java mediante la definición de atributos privados y métodos públicos para acceder y modificar dichos atributos.

A parte para comprobar que todo funciona correctamente he creado un programa que crea un objeto de la clase "Persona" y lo utiliza para mostrar los valores de sus atributos. Luego, modifica el valor del atributo "nombre" y muestra el valor actualizado del mismo.

```java
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
  
```

