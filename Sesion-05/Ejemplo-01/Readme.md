[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 05`](../Readme.md) > `Ejemplo 1`

## Ejemplo 1: Views, Button

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Crear un Fragment dentro de Un View.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.
2. Seguir la instrucción específica para esta sesión.

### 3. Desarrollo :computer:

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

2. En el directorio _layout_ crearemos un nuevo archivo _xml_ para nuestro ___Fragment___. Este layout representa la interfaz de nuestro Fragmento, que en este caso será una simple imagen contenida en un _ImageView_.

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="120dp"
        android:layout_height="120dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:src="@drawable/bedu" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

3. Dentro del _activity_main.xml_, incluiremos un _fragment_ que contendrá el _layout_ generado previamente.

```xml 
<fragment
        xmlns:android="http://schemas.android.com/apk/res/android"
        class="com.example.fragments.ExampleFragment"
        android:id="@+id/frgDetalle"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

4. Muy bien! Ahora toca asociar el view nuestro ___Fragment___ a su respectiva clase, por lo tanto creamos un nuevo archivo .kt y creamos nuestra clase que extenderá de la Superclase __Fragment__ .

```kotlin
class ExampleFragment : Fragment() {
 
}
```

Para asociar nuestro layout a la clase, utilizamos el método ___inflate___ dentro de la función ___onCreateView___

```kotlin
 override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }
```



      <img src="images/layout_modes.gif" width="85%">
     
4. Ahora vamos a explorar un poco las herramientas que la IDE nos brinda para este tipo de archivos:

      <img src="images/2.png" width="50%">


[`Anterior`](../Readme.md#botones-y-textos) | [`Siguiente`](../Readme.md#inputs-e-imágenes)

</div>
