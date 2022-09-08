# Herencia en C++
Demostración usando el lenguaje C++ del ejemplo [Aventura](http://dodero.github.io/iiss/iiss-oop-1/#ejemplo-aventura-v01) que se encuentra en los apuntes de la asignatura

## Autor
Javier David García-Pardo Montero

## Requisitos
Compilar C++ requiere instalar bibliotecas, programas y compiladores necesarios para el sistema operativo. 
Para ello se ejecutarán los siguientes comandos.

Primero se recomienda actualizar las bibliotecas en los repositoriso del sistema operativo
```bash
sudo apt-get update
```
A continuación se actualizan los programas a su última versión
```bash
sudo apt-get upgrade
```
Finalmente se ejecuta el siguiente comando que instalará el compilador GCC y otras herramientas de desarrollo
```bash
sudo apt-get install build-essential 
```

## Compilación y ejecución del programa
Para compilar y ejecutar el programa herencia en C++ basta con abrir una terminal en la ruta temas/herencia/cpp/ y ejecutar el siguiente comando

```bash
g++ herencia.cpp -o herencia
./herencia
```

## Salida esperada del programa
```bash
PersonajeDeAccion luchando
Heroe luchando
Heroe volando
Heroe volando
PersonajeDeAccion luchando
PersonajeDeAccion luchando
Heroe luchando
PersonajeDeAccion luchando
Heroe volando
Heroe volando
Heroe volando
Heroe volando
```
