# prueba_tesicnor
Repositorio con el contenido de la prueba técnica para la empresa Tesicnor

### Frameworks y tecnologías empleadas:

  1. Script Python para el acceso a la API y a la base de datos SQLite.
     He utilizado python para ambas conexiones dado que mi conocimiento en este lenguaje es mayor y me encuentro más cómodo.
  2. Base de datos SQLite.
     He creído adecuado emplear esta base de datos por su sencillez y el hecho de que es autocontenido; es decir, no requiere de gestor de       BBDD, solo con el archivo es suficiente.
  3. Para el resto he creído conveniente usar Java Springboot pese a no ser el framework con el que más familiarizado estoy.

### Método de funcionamiento:
  1. El primer paso es generar la base de datos. *El proyecto trae una base de datos poblada por lo que este paso se puede saltar*
     Para crear una nueva base de datos hace falta tener python3 y las librerías requests y sqlite3 instaladas. Primero hay que modificar el código especificando el nombre del archivo que se desea generar y la apikey que se va a emplear (he decidido no publicar la apikey ni la ruta del directorio por motivos de seguridad). El código puede ejecutarse o bien desde un IDE que soporte el lenguaje o bien desde cmd o bash con el comando "python prueba_API.py" desde la carpeta.
  2. El programa principal se puede ejecutar accediendo a la carpeta "prueba-tesicnor" desde cmd con el comando "java -jar prueba-tesicnor-0.0.1-SNAPSHOT.jar" o haciendo doble click en el archivo .jar en la misma ubicación. Una vez ejecutado, abrir en un navegador la dirección localhost con puerto 8080 -> "localhost:8080".



