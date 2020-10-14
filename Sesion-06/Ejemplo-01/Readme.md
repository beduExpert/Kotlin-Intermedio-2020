[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 06`](../Readme.md) > `Ejemplo 1`

## Ejemplo 1: Components

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Implementar _Components_ de Material Design en nuestra interfaz.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.
2. Seguir la instrucción específica para esta sesión.

### 3. Desarrollo :computer:

La meta de este ejercicio es simple: Agregar algunos de los components básicos a nuestro _layout_ y asignarles funcionalidad.

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

2. Abrimos ___app/build.gradle___ y en ___dependencies___, agregar la siguiente línea:

```kotlin
api 'com.google.android.material:material:1.3.0-alpha03'
```

Esto para tener disponible los componentes.

3. Para poder implementar satisfactoriamente nuestros _components_, abrimos ___res/values/styles.mxl___ y verificamos que nuestro ___AppTheme___ contenga la siguiente propiedad:

```kotlin
parent="Theme.MaterialComponents.Light.DarkActionBar"
```

4. 

[`Anterior`](../Readme.md) | [`Siguiente`](../Reto-01)




</div>
