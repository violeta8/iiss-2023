# Inyección de dependencias en Java usando el framework Guice

Demostración usando el lenguaje Java y el framework [Guice](https://github.com/google/guice/wiki/) del ejemplo [BankAccount](http://dodero.github.io/iiss/iiss-oop-3/#ejercicio-identificador-de-bankaccount-con-inyeccion-de-dependencias) que se encuentra en los apuntes de la asignatura

## Autor
Javier David García-Pardo Montero

## Compilación y ejecución del programa

Para ejecutar el programa basta con abrir el proyecto en Eclipse y hacer click derecho en el paquete inyecciondependencias, a continuación click en  Run As seleccionando la opción Java Application
y finalmente el programa es ejecutado y se puede ver el resultado por pantalla.

Se necesita Java y JVM, la máquina virtual de Java, para poder ejecutar código Java. 
A continuación se detallan los pasos para instalar Java Runtime (JRE) y 
el kit de desarrollo de Java (JDK) utilizando apt.

Primero se actualiza el índice de paquetes
```bash
sudo apt update
```
Posteriormente instale Java Runtime ENvironment (JRE) ejecutando el siguiente comando
```bash
sudo apt install default-jre
```
A continuación, compruebe si Java ya está instalado
```bash
java -version
```
Es posible que necesite el kit de desarrollo de Java (JDK) además de JRE para
compilar y ejecutar algunos programas específicos basados en Java, para ello,
ejecute el siguiente comando
```bash
sudo apt install default-jdk
```
Verifique que el JDK se haya instalado revisando la versión de javac, el compilador de Java:
```bash
javac -version
```

## Salida esperada del programa
```bash
La cuenta b2 es mayor que la b1 comparando los id
La cuenta b1 es mayor que la b2 comparando las fechas de creacion
```
