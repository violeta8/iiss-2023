## Explicación del código

El código es una aplicación web Flask que utiliza aspectos de Python para medir el tiempo de ejecución de una función y registrar cuándo se llama y se completa una función. El código consta de tres partes principales: 
1. **Definición de los decoradores** : En las líneas 7-21, se definen dos decoradores, `time_it` y `log_it`. Ambos decoradores toman una función como argumento y devuelven una función que agrega una funcionalidad adicional a la función original. 
2. **Definición de la ruta y aplicación de los decoradores** : En la línea 24, se define una ruta para la página principal del sitio web (`'/'`) y se aplican los decoradores `time_it` y `log_it` a la función `fun_welcome`. Esto significa que cuando un usuario visita la página principal, primero se imprimirá un registro de llamada en la consola, luego se medirá el tiempo de ejecución de la función y finalmente se devolverá el mensaje de "¡Hola, mundo!" al navegador. 
3. **Ejecución de la aplicación** : En las líneas 28-30, se ejecuta la aplicación Flask y se la hace escuchar en el puerto 8080 de la máquina local.
## Cómo compilar y ejecutar el código 
1. Primero, aseguramos tener Python 3.x instalado en tu máquina. Si no es así [descarga](https://www.python.org/download/). 
2. A continuación, instala Flask, el paquete de Python que se utiliza para crear aplicaciones web. Abre una terminal (en Windows, abre el símbolo del sistema o PowerShell) y escribe el siguiente comando: `pip install flask`. 
3. Para ejecutar la aplicación, abre una terminal en la carpeta donde esta guardado el archivo `aspectos.py` y escribe el siguiente comando: `python aspectos.py`. Esto iniciará la aplicación Flask y la hará escuchar en el puerto 8080 de tu máquina. 
4. Ahora, abre un navegador web y escribe la siguiente dirección en la barra de direcciones: `http://localhost:8080/`. Esto debería mostrar el mensaje "¡Hola, mundo!" en la página web y los registros de llamada y tiempo de ejecución en la consola.
## Cómo verificar que la aplicación funciona correctamente

Para verificar que la aplicación funciona correctamente: 
1. La aplicación se haya ejecutado correctamente sin errores. Si hay algún error, la aplicación no funcionará. 
2. Al visitar la dirección `http://localhost:8080/` en un navegador web, se muestra el mensaje "¡Hola, mundo!" en la página web. 
3. En la consola, se imprimen los registros de llamada y tiempo de ejecución de la función `fun_welcome` cuando se visita la página web.
4. Al igual que en el paso 3, pero esta vez, se imprimen los registros de llamada y tiempo de ejecución de la función `other_fun` cuando se visita la dirección `http://localhost:8080/otra_funcion` en un navegador web.