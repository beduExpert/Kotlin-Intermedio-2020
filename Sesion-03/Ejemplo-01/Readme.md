[`Kotlin Intermedio`](../../Readme.md) > [`Sesión 03`](../Readme.md) > `Ejemplo 1`

## Ejemplo 1: Layouts: RelativeLayout

<div style="text-align: justify;">

### 1. Objetivos :dart:

- Acomodar los elementos de acuerdo al patrón de RelativeLayout.

### 2. Requisitos :clipboard:

1. Android Studio Instalado en nuestra computadora.

### 3. Desarrollo :computer:

El Relative Layout es un ViewGroup que organiza su contenido de acuerdo a posiciones relativas a su área o a los otros miembros del layout. para hacer el enlace con otros Views, se requiere que declaren id's, en el layout de abajo, los id tienen el nombre del color que representa cada vista, para identificarlos mejor.

La siguiente tabla muestra los atributos que tienen qué ver con el posicionamiento de sus elementos:


ATRIBUTO | DESCRIPCIÓN
---------|------------
layout_above | posiciona el borde inferior al borde superiori de la vista con el id que se pase este atributo.
layout_alignBaseline | posiciona la línea de base con la línea de la vista llamada.
layout_alignBottom | Hace que se alíneen los bordes inferiores de las vistas.
layout_alignEnd | Hace que se alíneen los bordes finales de las vistas.
layout_alignLeft | Hace que se alíneen los bordes izquierdos de las vistas.
layout_alignParentBottom | si true, pone el borde inferior del View sobre el inferior del RelativeLayout 
layout_alignParentEnd | si true, pone el borde final del View sobre el final del RelativeLayout 
layout_alignParentLeft | si true, pone el borde izquierdo del View sobre el izquierdo del RelativeLayout 
ayout_alignParentRight | si true, pone el borde derecho del View sobre el derecho del RelativeLayout 
ayout_alignParentStart | si true, pone el borde inicial del View sobre el inicial del RelativeLayout 
layout_alignParentTop | si true, pone el borde superior del View sobre el superior del RelativeLayout
layout_alignRight | borde derecho con borde derecho del View asignado
layout_alignStart | borde inicial con borde inicial del View asignado
layout_alignTop | borde superior con borde superior del View asignado
layout_centerVertical | si true, centra verticalmente el View con su padre
layout_above | posiciona el borde inferior al borde superior de la vista con el id que se le pase a este atributo
layout_below | posiciona el borde superior al borde inferior de la vista con el id que se le pase a este atributo
layout_toRightOf | posiciona el borde izquiero junto al derecho del View asignado
layout_toLeftOf | posiciona el borde derecho junto al izquierdo del View asignado


El ejemplo de abajo ya tiene implementado el RelativeLayout y está ordenado de acuerdo al primer ejercicio: 

1. Abre __Android Studio__ y crea un nuevo proyecto con Activity Vacía (Empty Activity).

2. 

   <img src="images/0.png" width="40%">



[`Anterior`](../Readme.md) | [`Siguiente`](../Readme.md#layouts:-constraintlayout)

</div>
