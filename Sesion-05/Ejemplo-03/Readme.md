[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 05`](../Readme.md) > `Ejemplo 1`

## Ejemplo 3: Fragment Transactions

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Crear y remover _Fragments_ programáticamente.
- Mostrar y esconder un _Fragment_ en específico.
- Visualizar cómo las transacciones afectan al ciclo de vida de un _Fragment_.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.
2. Seguir la instrucción específica para esta sesión.

### 3. Desarrollo :computer:

Hasta ahora hemos declarado ___Fragments___ por medio del tag ___fragment___ dentro del archivo _xml_ del layout de un _Activity_, pero también esto se puede hacer de forma programática utilizando un _contenedor_, tal como un ___ViewGroup___. En este caso, vamos a utilizar operaciones para manipular el ciclo de vida de un ___Fragmnet___ mediante el ___supportFragmentManager___. La lista de acciones que haremos son:

* Agregar un _Fragment_
* Removerlo
* Ocultarlo
* Mostrarlo
* Agregar un segundo _Fragment_
* Remover el segundo _Fragment_
* Attach (adjuntar)
* Detach (remover)
* Reemplazar por un _Fragment_
* Reemplazar por el segundo _Fragment_

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

2. Crearemos un nuevo _layout_ para nuestro ___activity_main.xml___, de modo que en la parte superior tengamos un arreglo horizontal scrolleable de botones que corresponderán a las acciones a realizar. Bajo esta barra de botones, tendremos el ___FrameLayout___ que fungirá como contenedor para agregar nuestros ___Fragments___. 

```xml 
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <HorizontalScrollView
        android:id="@+id/scroll"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">
        <LinearLayout
            android:paddingVertical="12dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <Button
                android:id="@+id/addButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Agregar" />

            <Button
                android:id="@+id/removeButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Remover" />
            <Button
                android:id="@+id/hideButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Esconder" />
            <Button
                android:id="@+id/showButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Mostrar" />
            <Button
                android:id="@+id/add2Button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Agregar 2" />
            <Button
                android:id="@+id/remove2Button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Remover 2" />
            <Button
                android:id="@+id/attachButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Attach" />
            <Button
                android:id="@+id/detachButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Detach" />
            <Button
                android:id="@+id/replace1Button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Remplazar por 1" />

            <Button
                android:id="@+id/replace2Button"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Reemplazar por 2" />
        </LinearLayout>
    </HorizontalScrollView>
    <FrameLayout
        android:background="#DDD"
        android:id="@+id/container"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintTop_toBottomOf="@id/scroll"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>
</androidx.constraintlayout.widget.ConstraintLayout>
```

3. Crearemos dos ___Fragments___: El primero llevará el [Logo de Bedu]() y su _layout_ llamará ___fragment_bedu.xml___.

```xml 
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android"
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

Su clase correspondiente será la siguiente:

```kotlin
class BeduFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bedu, container, false)
    }

}
```

4. Para el segundo Fragment, repetimos el paso anterior, cambiando los nombres a ___fragment_beto.xml___ y a ___BetoFragment___ respectivamente. El nombre de la imagen del layout será ___beto.png___.

5. 

[`Anterior`](../Readme.md) | [`Siguiente`](../Reto-02)




</div>
