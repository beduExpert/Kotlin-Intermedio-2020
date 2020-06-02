[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 02`](../Readme.md) > `Ejemplo 1`

## Ejemplo 1: Inputs e imágenes

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Posicionar imágenes en el layout a través de un View.
- Explorar los atributos básicos de un View.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.
2. Seguir la instrucción específica para esta sesión.

### 3. Desarrollo :computer:

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

2. Abrimos el archivo XML encontrado en la carpeta _layout_.
   
3. Reemplazamos el código autogenerado por [este](../Readme#instrucciones-de-la-sesión) y agregamos un ImageView, mediante el siguiente código:

```kotlin
<ImageView
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:src="@drawable/beto"
        />
```

4. Notamos que existe un atributo ___src___ con un drawable llamado _beto_, por lo que tenemos qué agregar una imagen con ese nombre en el directorio ___res/drawable/___.

<img src="images/0.png" width="40%">

5. Nuestro diseño se visualiza así:

<img src="images/wrap_content.png" width="40%">

El tamaño excesivo se debe a que el ImageView por asignarle _wrap_content_ al ancho y alto, se ajusta al tamaño de la imagen.

Vamos a definir un tamaño específico para nuestro _View_:

```xml
android:layout_height="48dp"
android:layout_width="120dp"
```

6. Aunque la imagen se alcanza a ver completamente, las dimensiones del _ImageView_ no corresponden a la escala de la imagen. En este _View_ tenemos disponible un atributo para describir el escalamiento que llevará nuestra imagen:


VALOR | ENUM en ImageView.ScaleType | DESCRIPCION | EJEMPLO
------|------------------|-------------|----------
center | CENTER | centra la imagen sin escalamiento |   <img src="images/center.png" width="80%">
centerCrop | CENTER_CROP | centra la imagen y mantiene su proporción, haciendo un recorte si la imagen es más grande que el _View_ | <img src="images/center_crop.png" width="80%">
centerInside | CENTER_INSIDE | redimensiona la imagen manteniendo su proporción para que sus medidas quepan en el _View_ (igual o menor). |  <img src="images/center_inside.png" width="80%">
fitEnd | FIT_START | redimensiona la imagen manteniendo su proporción para que quepa y se alinee al principio del _View_ | <img src="images/fit_end.png" width="80%">
fitCenter | FIT_CENTER | redimension la imagen manteniendo su proporción para que quepa y se centre en el _View_ | <img src="images/fit_center.png" width="80%">
fitEnd | FIT_END | reescala la imagen manteniendo su proporción para que quepa y se alinee al final del _View_ | <img src="images/fit_end.png" width="80%">
fitEnd | FIT_END | redimensiona la imagen cambiando su proporción para ajustarse a las medidas del _View_ | <img src="images/fit_xy.png" width="80%">

Experimentemos con cada una de estas opciones. Finalmente, utilizaremos la opción ___centerInside___.



[`Anterior`](../Readme.md#botones-y-textos) | [`Siguiente`](../Readme.md#inputs-e-imágenes)

</div>
