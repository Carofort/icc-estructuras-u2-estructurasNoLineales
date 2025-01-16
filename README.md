### **EXPLICACIÓN DE LOS EJERCICIOS: 01, 02 Y 04**

-EJERCICIO 01: Insert BST

Esta clase "InsertBSTTest" es similar a la clase del ArbolBinario, pues utiliza la misma estructura para crear un arbol, la única diferencia es que esta vez el usuario es capaz de agregar sus propios valores al arbol.
Este proceso se realiza en la Clase App, donde en el método runEjercicio1() pide los valores al usuario, para posteriormente mostrar el arreglo ingresado (input) y el arbol binario formado a partir de esos valores (output).

**Ejemplo Visual:**

INPUT:
[6, 8, 9, 2, 3, 1]

OUTPUT:
    9
  8
6
    3
  2
    1

-Ejercicio 02: Invertir Árbol

La clase "InvertBinaryTree" trata con un método recursivo llamado invertirArbol(), el cual verifica primeramente si la raiz es nula, para luego intercambiar las ramas de los arboles, de tal manera que la parte derecha se mude a la parte izquierda y viceversa. Para esto se utiliza un auxiliar de tipo *Node*, el cual servirá para intercambiar los valores, luego se realizan 2 llamadas recursivas al mismo método.

**Ejemplo Visual:**

INPUT:
    9
  8
7  
  4
      3
    2
      1


OUTPUT:
      1
    2
      3
  4
7
  8
    9

-Ejercicio 04: Profundidad Máxima

En la clase "Depth" se realizará el método maxDepth() que almacena la raíz del árbol, verificando si la raíz es nula, la profundidad sería simplemente cero. En caso que si exista raíz, se crean 2 variables tipo *int* donde se llama al método recursivo para almacenar la profundidad máxima del último valor del árbol.

return 1 + Math.max(profundidadIzquierda, profundidadDerecha);
Esta linea de código compara la parte derecha e izquierda buscando el valor más alto, sumándole 1 para incluir el nodo actual de profundidad total. 

**Ejemplo Visual:**

INPUT:
    9
  8
    7
5
    3
  2
    1

OUTPUT:3