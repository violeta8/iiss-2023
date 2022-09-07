# Undefined optionals en C++

Demostración usando el lenguaje C++ del ejemplo [MobileTester](http://dodero.github.io/iiss/iiss-err/#optionals) que se encuentra en el apartado Optionals de los apuntes de la asignatura

## Autor
Javier David García-Pardo Montero

## Compilación y ejecución del programa

En primer lugar conviene tener en cuenta que los optionals están disponibles a partir de C++17 luego habrá que indicárselo al compilador.
Para compilar y ejecutar el programa optionals en C++ basta con abrir una terminal en la ruta temas/undefined/cpp2/ y ejecutar los siguientes comandos

```bash
g++ -std=c++17 optionals.cpp -o optionals
./optionals
```
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

## Salida esperada del programa
```bash
Apple iPhone 6s Screen Width = 750
Apple iPhone 16s Screen Width = 0
```
