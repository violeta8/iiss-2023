Para definir una clase en Scala que hereda de otra clase, se utiliza la palabra clave "extends" seguida del nombre de la clase base.

Si necesitasemos una clase "Animal" que tuviera ciertas propiedades y métodos, como "nombre", "edad" y "hacerSonido()". Ahora, queremos crear una clase "Perro" que herede de la clase "Animal" y también tenga sus propias propiedades y métodos.

Este código de Scala define dos clases, Animal y Perro, y un objeto ejemplo con un método main que crea instancias de ambas clases y llama a sus métodos.

La clase Animal tiene dos atributos: nombre y edad, que son pasados como argumentos al constructor de la clase. También tiene un método hacerSonido que simplemente imprime "Haciendo sonido..." por pantalla.

La clase Perro es una subclase de Animal y agrega un nuevo atributo, raza. Su constructor también toma tres argumentos: nombre, edad y raza, y llama al constructor de la clase base usando la sintaxis "extends Animal(nombre, edad)".

La clase Perro también define un nuevo método llamado ladrar que imprime "Guau guau!" por pantalla:
```scala
public class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void hacerSonido() {
        System.out.println("Haciendo sonido...");
    }
}

public class Perro extends Animal {
    private String raza;
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    public void ladrar() {
        System.out.println("Guau guau!");
    }
}
```


Finalmente, el objeto ejemplo contiene un método main que crea una instancia de Animal llamada miAnimal y una instancia de Perro llamada miPerro, y luego llama a los métodos hacerSonido y ladrar de miAnimal y miPerro, respectivamente, para producir la salida en la consola.

```scala
public class ejemplo {
    public static void main(String[] args) {
        Animal miAnimal = new Animal("Mimi", 2);
        Perro miPerro = new Perro("Fido", 3, "Labrador");
        
        miAnimal.hacerSonido();
        miPerro.hacerSonido();
        miPerro.ladrar();
    }
}
```