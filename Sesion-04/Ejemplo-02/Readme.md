## Spinners

### OBJETIVO

- Que el alumno aprenda a utilizar los spinners y sus limitados casos de uso.

#### REQUISITOS

1. Haber estudiado previamente la presentación de la sesión 2, del tema Spinner en específico.

#### DESARROLLO

1.- Crear un proyecto con Activity vacía.

2.- Generar un Layout, incluyendo un Spinner con su respectivo id para poder ser identificado posteriormente.

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Spinner
        android:id="@+id/spinner"
        android:layout_width="149dp"
        android:layout_height="40dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="64dp"
        android:layout_marginEnd="8dp"
        android:background="#EDEDED"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="48dp"
        android:textSize="24sp"
        android:text="Selecciona tu idioma"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

3.- En el MainActivity, crear una variable de clase que almacene un arreglo de Strings con idiomas dentro.

```kotlin
 var language = arrayOf("Inglés", "Español", "Chino", "Ruso", "Coreano", "Alemán", "Francés", "Holandés")
 ```
 
 4.- Debemos setear el listener del spinner, para poder mostrar un mensaje cuando el usuario halla seleccionado un idioma.
 
 ```kotlin
 spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext ,language[position] , Toast.LENGTH_LONG).show()
            }
        }
 ```

5.- Sin embargo, en este listener podemos ver un callback llamado *onNothingSelected()*. Este callback es llamado si el usuario hizo click en algún elemento que ya no existe en la lista. Llamaremos un alert en caso de que eso ocurra.

```kotlin
override fun onNothingSelected(parent: AdapterView<*>?) {
        showDialog("No seleccionaste idioma","Vuelve a desplegar la lista y asegúrate de elegir correctamente a alguna")
}
            
            ...
            
private fun showDialog(title:String,message:String){
        AlertDialog.Builder(this)
             .setTitle(title)
             .setMessage(message)
             .setPositiveButton("OK"){dialogInterface, which -> }
             .create()
             .show()
}
```

La app se tiene qué ver parecido a la sig. imagen:

<img src="result.png" width="33%">

