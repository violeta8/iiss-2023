El principio de encapsulación en Scala se refiere a la técnica de ocultar los detalles internos de una clase, para que solo se pueda interactuar con ella a través de una interfaz pública, definida por sus métodos de acceso y modificación.

Supongamos que queremos crear una clase "Persona" que tenga los siguientes atributos: nombre, edad y género. Para asegurarnos de que estos atributos sean modificados y accedidos de manera adecuada, aplicaremos el principio de encapsulación. El cual intenta lograr un código más robusto y mantenible, ya que al ocultar la complejidad interna de un objeto, se pueden realizar cambios en su implementación sin afectar al resto del programa. Además, la encapsulación ayuda a prevenir errores y garantiza la integridad de los datos al controlar el acceso y la manipulación de los mismos.

```scala 
class Persona(private var nombre: String, private var edad: Int, private var genero: Char) {

  // Métodos de acceso (getters)
  def getNombre(): String = nombre
  
  def getEdad(): Int = edad
  
  def getGenero(): Char = genero
  
  // Métodos de modificación (setters)
  def setNombre(nombre: String): Unit = {
    this.nombre = nombre
  }
  
  def setEdad(edad: Int): Unit = {
    this.edad = edad
  }
  
  def setGenero(genero: Char): Unit = {
    this.genero = genero
  }
}
```

En este ejemplo: 
Primero, se definiría la clase "Persona" con sus atributos privados "nombre", "edad" y "género":
```scala
class Persona(private var nombre: String, private var edad: Int, private var genero: String) {
  // ...
}
```

A continuación, se definirían los métodos públicos "getNombre()", "getEdad()" y "getGenero()" para acceder a los atributos privados, así como los métodos públicos "setNombre()", "setEdad()" y "setGenero()" para modificar los atributos privados:
```scala
def setNombre(nombre: String): Unit = {
    this.nombre = nombre
}
  
def setEdad(edad: Int): Unit = {
    this.edad = edad
}
  
def setGenero(genero: Char): Unit = {
    this.genero = genero
}
```

También se han definido tres métodos públicos llamados "setNombre()", "setEdad()" y "setGenero()". Estos métodos se conocen como "setters" y se utilizan para modificar los valores de los atributos privados de la clase desde fuera de la misma. Cada método toma un parámetro y lo utiliza para actualizar el valor del atributo correspondiente.

Finalmente, se ha definido un constructor público para la clase "Persona" que toma tres parámetros ("nombre", "edad" y "género") y los utiliza para inicializar los atributos correspondientes de la clase.

En conjunto, estos elementos forman un ejemplo básico de cómo se puede aplicar el principio de encapsulación en Scala mediante la definición de atributos privados y métodos públicos para acceder y modificar dichos atributos.

A parte para comprobar que todo funciona correctamente he creado un programa que crea un objeto de la clase "Persona" y lo utiliza para mostrar los valores de sus atributos. Luego, modifica el valor del atributo "nombre" y muestra el valor actualizado del mismo.

```scala
object ejemplo {
  def main(args: Array[String]): Unit = {
    // Crear una instancia de la clase Persona
    val persona1 = new Persona("Juan", 25, 'M')

    // Obtener los valores de los atributos de la clase Persona
    println("Nombre: " + persona1.getNombre())
    println("Edad: " + persona1.getEdad())
    println("Género: " + persona1.getGenero())

    // Modificar el valor del atributo "nombre"
    persona1.setNombre("Tu padre")

    // Obtener el valor actualizado del atributo "nombre"
    println("Nombre actualizado: " + persona1.getNombre())
  }
} 
```

