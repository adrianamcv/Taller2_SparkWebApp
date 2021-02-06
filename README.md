## Introducción al diseño de sistemas - (Maven, HEROKU, GIT, Spark, GITHUB)

Este proyecto tiene como objetivo la creación de aplicación implementado el framework spark. Se creó una calculadora que calcula la media y la desviación estándar, la cua´l recibe los datos de entrada desde un formulario (allí los datos se deben ingresar separados por coma), una vez se ingresan los datos se puede seleccionar la opción calcular y se ontendrán los resultados deseados.


## Requisitos del sistema

Antes de iniciar, debemos asegurarnos de contar con las herramientas necesarias para poder ejecutar el proyecto, estas herramientas son:

- Java JDK
- Apache Maven
- Git


## Descargando el programa

Para descargar este proyecto lo primero que debemos hacer es seleccionar el directorio que queremos usar, abrimos una ventana de consola y ejecutamos el siguiente comando: 

``$ git clone https://github.com/adrianamcv/Taller2_SparkWebApp.git``

Este comando descargará el contenido dentro de un repositorio local para que podamos usarlo.


## Ejecutar el proyecto

En el directorio en dónde se encuentra el proyecto, y desde la venta de comandos, ejecutamos lo siguiente:

``$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.ASE.app.SparkWebApp"``


## Pruebas

Para ejecutar las pruebas basta con ejecutar el siguiente comando:

``$mvn package``


## Documentación

La documentación de este proyecto se puede encontrar en la siguiente dirección:

``target\site\apidocs``

Para generar la documentación nuevamente, solo se debe ejecutar el siguiente comando desde la consola

``` $ mvn javadoc:javadoc```


# Licencia

[LICENSE.txt](LICENSE.txt)


## Badge CircleCI

[![CircleCI](https://circleci.com/gh/adrianamcv/Taller2_SparkWebApp.svg?style=svg)](https://app.circleci.com/pipelines/github/adrianamcv/Taller2_SparkWebApp)


## Link Heroku

[SaprkWebApp](https://calculadora-sparkwebapp.herokuapp.com/datos)


## Autor

Adriana Marcela Castañeda


