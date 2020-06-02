[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 02`](../Readme.md) > `Ejemplo 1`

## Ejemplo 1: Views, Button

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Crear un View desde el layout.
- Explorar los atributos básicos de un View.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.
2. Seguir la instrucción específica para esta sesión.

### 3. Desarrollo :computer:

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

   <img src="images/0.png" width="40%">

2. Una vez creado el proyecto, nos dirigimos al directorio de nuestro proyecto, localizamos la carpeta de recursos y abrimos el archivo XML enconatrado en la carpeta _layout_.

   <img src="images/1.png" width="50%">
   
3. Se abrirá una nueva pestaña con una ventana que muestra el diseño de la pantalla principal, esta es una interpretación gráfica del código XML que se encuentra en nuestro archivo, y por supuesto podemos visualizarlo en Android Studio. Las formas de visualizar este archivo son por código,diseño o mixto y se muestran en el siguiente gif:

      <img src="images/layout_modes.png" width="50%">
     
4. Seleccionamos el modo diseño para explorar algunas opciones que brinda la interfaz, mostrando las secciones por colores en la siguiente imagen: 

* ![#F00](https://via.placeholder.com/15/f03c15/000000?text=+): La barra vertical izquierda contiene __Palette__ Que nos muestra una serie de Views para insertar en el layout y __Component tree__ Que muestra la estructura de nuestro layout. 
* ![#FF0](https://via.placeholder.com/15/f03c15/000000?text=+): En la barra superior vertical, tenemos opciones para mostrar el diseño con su _blueprint_, una opción para colocar el diseño en formato vertical/horizontal, seleccionar la resolución de la pantalla mediante móviles predefinidos o con medidas personalizadas, la API de android entre otras cosas. 
* ![#00F](https://via.placeholder.com/15/f03c15/000000?text=+):En la barra lateral derecha, tenemos la opción ___attributes___ que despliegan los atributos de un _View_ seleccionado con el cursor.
* ![#0F0](https://via.placeholder.com/15/f03c15/000000?text=+): Este menú flotante posibilita el zoom in/out al layout, capacidad de pan, escalar la app a resolución 1:1.



   En este caso, elegiremos una opción que permita visualizar nuestro código con el que trabajaremos manualmente, a pesar de poder utilizar el asistente gráfico.

4. Copiamos 

    - _Name_ es el nombre de nuestro proyecto.

    - El _Package Name_ debe ser único; es por eso que el paquete toma el nombre del dominio web de la organización y lo invierte, dejando al final el nombre de nuestro proyecto en minúsculas. En este caso, el dominio de la organización es [bedu.org](bedu.org) y el nombre del proyecto es holabedu, por lo tanto, el package name es ___org.bedu.holabedu___.

    - _Save location_ contiene la ruta donde se guarda el proyecto.

    - En _Language_ podremos elegir entre __Kotlin__ y __Java__. En este módulo utilizaremos siempre Kotlin.

    - El SDK mínimo determina la versión mínima de Android a la que le daremos soporte.

    - Por último, la opción _Use legacy android.support libraries_ utiliza una biblioteca vieja para dar soporte a versiones android antiguas en el desarrollo con una API más nueva. Su uso no es recomendable en proyectos nuevos, ya que la biblioteca de compatibilidad _AndroidX_ provee de la misma funcionalidad y de muchas herramientas nuevas por medio de Jetpack (conjunto de bibliotecas que agregan nuevas funcionalidades).

    - Terminado todo, daremos ___finish___ para crear el proyecto.

   ![imagen](images/03.png)
   
  
**¡Felicidades! Haz creado tu primer proyecto con Android Studio**

[`Anterior`](../Readme.md#setup-inicial) | [`Siguiente`](../Readme.md#estructura-del-proyecto)

</div>
