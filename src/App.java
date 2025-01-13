import java.util.List;

import main.Ejercicio_03_listLevels.ListLevels;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
       //runArbolBinario();
       //runEjercicio3();
       runArbolAVL();
    }

    public static void runArbolAVL (){
        ArbolAVL arbolAVL = new ArbolAVL();
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};

        for (int i = 0; i < values.length; i++){
            arbolAVL.insert(values[i]);
            arbolAVL.printTree();
        }
        System.out.println("Arbol Final: ");
        arbolAVL.printTree();

    }

    public static void runArbolBinario (){
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        int [] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

        for (int i = 0; i < valores.length; i++){
            arbolBinario.insert(valores[i]);
        }
        
        arbolBinario.printTree();
        System.out.println("Recorrido preOrder Iterativo: ");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());

        System.out.println("\nRecorrido preOrder Recursivo: ");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido postOrder Recursivo: ");
        arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido inOrder Recursivo: ");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
    }

    public static void runEjercicio3(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();

        int [] valores = {4, 2, 7, 1, 3, 6, 9};

        for (int i = 0; i < valores.length; i++){
            arbolBinario.insert(valores[i]);
        }
        
        System.out.println("Input: ");
        arbolBinario.printTree();

        List<List<Node>> lista = levels.listLevels(arbolBinario.getRoot());
        
        System.out.println("Output: ");
        for(List<Node> nivel : lista){
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if(i < nivel.size() - 1){
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }  
    }
}
