### Código

El código proporcionado define un objeto `HighSchoolMusical` que contiene varias funciones y un método `main` que utiliza esas funciones para realizar operaciones en una lista de objetos `Character`. La clase `Character` es una clase de datos simple que tiene dos campos: `name` y `role`.

Las funciones incluidas son: 
- `getNames`: Esta función toma una lista de objetos `Character` y devuelve una lista que contiene solamente los nombres de los personajes. 
- `getDramaClubMembers`: Esta función toma una lista de objetos `Character` y devuelve una lista que contiene solamente los personajes que tienen el rol de "Drama club president" o "Sharpay's twin brother". 
- `hasBasketballCaptain`: Esta función toma una lista de objetos `Character` y devuelve un valor booleano que indica si algún personaje tiene el rol de "Basketball captain". 
- `getNameAndRole`: Esta función toma una lista de objetos `Character` y devuelve una lista que contiene las cadenas de texto con el nombre y el rol de cada personaje, separados por un guión.

El método `main` crea una lista de objetos `Character`, utiliza cada una de estas funciones con esa lista y muestra los resultados en la consola.
### Construir y compilar

Para construir y compilar este código, simplemente copie el código en un archivo de texto y guárdelo con una extensión `.scala`.

Luego, puede compilar el código usando el comando `scalac Lambda.scala`. Esto generará archivos de clase que se pueden ejecutar.
### Ejecución y prueba

Para probar el código, simplemente ejecute el archivo de clase generado con el comando `scala HighSchoolMusical`.

Esto ejecutará el método `main` y mostrará los resultados en la consola.

Por ejemplo, si copia y pega el código anterior en un archivo llamado `Lambda.scala` y luego lo compila con el comando `scalac Lambda.scala`, puede ejecutar el archivo generado con el comando `scala HighSchoolMusical`. Esto debería mostrar los siguientes resultados en la consola:

```mathematica
Names Only: List(Troy Bolton, Gabriella Montez, Sharpay Evans, Ryan Evans)
Drama Club Members: List(Character(Sharpay Evans,Drama club president), Character(Ryan Evans,Sharpay's twin brother))
Has Basketball Captain? true
Name and Role: List(Troy Bolton - Basketball captain, Gabriella Montez - New student, Sharpay Evans - Drama club president, Ryan Evans - Sharpay's twin brother)
```

Estos resultados muestran las listas generadas por cada una de las funciones definidas en el código.
