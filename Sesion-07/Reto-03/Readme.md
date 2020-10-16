[`Kotlin-Intermedio`](../Readme.md) > `Sesión 7` > `Reto 03`
 
	
## Creando Callback en clase independiente

### OBJETIVO 

- Con base al ejemplo-03, implementar una clase dedicada para mostrar el mismo menú flotante.

#### REQUISITOS 

1. Haber terminado Ejemplo-03
2. Utilizar clase de ayuda proporcionada en el repositorio.

#### DESARROLLO

Crear una clase que implemente un ActionMode.Callback().

```
class PrimaryActionModeCallback : ActionMode.Callback {
}
```

Este callback tendra un OnClick listener, lo implementaremos como Global.


> var onActionItemClickListener: OnActionItemClickListener? = null

Dentro de la clase sobreescribiremos los metodos necesarios, estos son:

	- onCreateActionMode
	- onPrepareActionMode
	- onDestroyActionMode
	- onActionItemClicked

Finalmente creamos un método para configuracion, agregamos titulo, subtitulo y menu.


```
fun startActionMode(view: View,
                        @MenuRes menuResId: Int,
                        title: String? = null,
                        subtitle: String? = null) {
        this.menuResId = menuResId
        this.title = title
        this.subtitle = subtitle
        view.startActionMode(this)
    }
```


Para hacer uso de esta clase:

```
// Start primary ActionMode

val primaryActionModeCallback = PrimaryActionModeCallback()
primaryActionModeCallback.startActionMode(view, R.menu.menu_actions, "Title", "Subtitle")
```