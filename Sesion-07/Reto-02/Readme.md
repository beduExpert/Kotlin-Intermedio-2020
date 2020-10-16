
[`Kotlin-Intermedio`](../Readme.md) > `Sesión 7` > `Reto 02`


## Agregando funcionalidad a los Menús

### OBJETIVO

- Agregar mas elementos a los menus de opciones

#### REQUISITOS

1. Android Studio 4.1
2. Kotlin 1.3
3. AVD Virtual device con API 11 (Android 3.0) o superior
4. Conexión a internet

#### DESARROLLO

El reto consiste en agregar funcionalidad a cada opción elegida en el menú.

Nos apoyaremos del siguiente código.

```
 if (item.isChecked) {
                    Toast.makeText(this, "Item1 Checked", Toast.LENGTH_LONG).show()
                    item.setChecked(false)
                } else {
                    Toast.makeText(this, "Item1 Not Checked", Toast.LENGTH_LONG).show()
                    item.setChecked(true)
                }
```

Se debe identificar en que parte del proyecto debe agregarse este código.
Igualmente jugar con el método `item.setChecked(false)`.

![Elemento de Menu](./images/1.gif)
