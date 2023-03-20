 La delegación en Java es un patrón de diseño que permite a un objeto utilizar los servicios de otro objeto para realizar una tarea en su nombre. En lugar de realizar la tarea por sí mismo, el objeto delega la tarea a otro objeto, que es responsable de realizarla. Cabe destacar que la delegación no es lo mismo que la herencia, ya que en la delegación un objeto utiliza los servicios de otro objeto sin ser una instancia de su clase o subclase. Además, la delegación permite una mayor flexibilidad y modularidad en el diseño de software, ya que los objetos pueden delegar tareas a otros objetos sin necesidad de conocer todos los detalles de su implementación interna.

Dicho esto, he creado una clase Lavadora tiene un objeto LavadoraAutomatica como atributo y en el método lavarRopa() delega la tarea de lavado a la clase LavadoraAutomatica llamando a su método lavar(). De esta manera, la clase Lavadora no tiene que implementar la lógica de lavado de ropa, sino que delega la tarea a otro objeto especializado en ella.

```java
public class Lavadora {
    private LavadoraAutomatica lavadoraAutomatica;
    
    public Lavadora() {
        this.lavadoraAutomatica = new LavadoraAutomatica();
    }
    
    public void lavarRopa() {
        lavadoraAutomatica.lavar();
    }
}

public class LavadoraAutomatica {
    public void lavar() {
        System.out.println("La lavadora está lavando la ropa...");
    }
}
```
Este código en lenguaje Java representa dos clases, la primera llamada "Lavadora" y la segunda llamada "LavadoraAutomatica". La clase Lavadora tiene un objeto de tipo LavadoraAutomatica que se utiliza para lavar la ropa.

En términos de delegación, la clase Lavadora delega la tarea de lavar la ropa a la clase LavadoraAutomatica, ya que utiliza su objeto para ejecutar el método "lavar()" que imprime en la consola el mensaje "La lavadora está lavando la ropa...".

Por lo tanto, la clase Lavadora no implementa directamente la lógica de lavado de la ropa, sino que delega esta tarea a la clase LavadoraAutomatica. La delegación permite separar la responsabilidad de lavado de la ropa de la clase principal Lavadora y mantener el código más organizado y fácil de mantener.

Para comprobar que todo funciona correctamente, he creado una clase de prueba llamada "ejemplo" que crea un objeto de tipo Lavadora y llama al método "lavarRopa()".

```java

public class ejemplo {
    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        l.lavarRopa();
    }
}
```