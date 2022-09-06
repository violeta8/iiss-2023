## Construcción y Compilación
Nos vamos a la carpeta donde tengamos el archivo
Ejecutamos en una terminal:
    javac Test.java

## Ejecución
Para ello ejecutamos desde la terminal:
    java Test.java

## Codigo
//crear anotacion
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
int value();
}

//Declarar la anotacion
class Hello{
@MyAnnotation(value=10)
public void hola(){System.out.println("hola anotacion");}
}

//acceso notificacion
class Test{
public static void main(String args[])throws Exception{

Hello h=new Hello();
Method m=h.getClass().getMethod("hola");

MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
System.out.println("el valor es : "+manno.value());
}}

