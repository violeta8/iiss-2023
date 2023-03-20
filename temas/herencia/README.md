La herencia en Java nos permite reutilizar el código de una clase existente y crear nuevas clases que tengan todas las propiedades y métodos de la clase original, además de sus propias propiedades y métodos adicionales. Esto nos permite escribir código más eficiente y fácil de mantener.

Si necesitasemos una clase "Animal" que tuviera ciertas propiedades y métodos, como "nombre", "edad" y "hacerSonido()". Ahora, queremos crear una clase "Perro" que herede de la clase "Animal" y también tenga sus propias propiedades y métodos.

Podríamos hacerlo de la siguiente manera:
```java
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
En este ejemplo, la clase "Perro" hereda las propiedades "nombre" y "edad" de la clase "Animal" y también tiene su propia propiedad "raza". Además, la clase "Perro" tiene su propio método "ladrar()", que no está presente en la clase "Animal".

Con esta herencia, podemos crear objetos "Perro" que tengan todas las propiedades y métodos de la clase "Animal" y también las propiedades y métodos adicionales de la clase "Perro". 