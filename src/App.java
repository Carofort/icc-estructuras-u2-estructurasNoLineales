import java.util.List;
import java.util.Scanner;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.*;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
       //runArbolBinario();
       //runArbolAVL();

       //DEBER:
       runEjercicio1();
       //runEjercicio2();
       //runEjercicio3();
       //runEjercicio4();
    }

    public static void runEjercicio1(){
        System.out.println("\n\nEJERCICIO 1: Insertar en un Arbol Binario de Busqueda");
        InsertBSTTest bst = new InsertBSTTest();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores, dejando un espacio: ");
        String linea = scanner.nextLine();
        String[] partes = linea.split(" ");
        int[] valores = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            valores[i] = Integer.parseInt(partes[i]);
        }
        for (int valor : valores) {
            bst.insert(valor);
        }

        System.out.println("\n\nINPUT:");
        System.out.println(java.util.Arrays.toString(valores));
        System.out.println("\n\nOUTPUT:");
        bst.imprimirArbol();

        scanner.close();
    }

    public static void runEjercicio2() {
        System.out.println("\n\nEJERCICIO 2: Invertir un Arbol Binario");
        InvertBinaryTree invert = new InvertBinaryTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores, dejando un espacio: ");
        String linea = scanner.nextLine();
        String[] partes = linea.split(" ");
        int[] valores = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            valores[i] = Integer.parseInt(partes[i]);
        }
        for (int valor : valores) {
            invert.insert(valor);
        }

        System.out.println("\n\nINPUT:");
        invert.imprimirArbol();
        invert.invertirArbol();
        System.out.println("\n\nOUTPUT:");
        invert.imprimirArbol();

        scanner.close();
    }

    public static void runEjercicio3(){
        System.out.println("\n\nEJERCICIO 3: Listar Niveles en Listas Enlazadas");
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

    public static void runEjercicio4() {
        System.out.println("\n\nEJERCICIO 4: Calcular la profundidad maxima");
        Depth depth = new Depth();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores, dejando un espacio: ");
        String linea = scanner.nextLine();
        String[] partes = linea.split(" ");
        int[] valores = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            valores[i] = Integer.parseInt(partes[i]);
        }
        for (int valor : valores) {
            depth.insert(valor);
        }

        System.out.println("\n\nINPUT:");
        depth.imprimirArbol();
        int profundidadMaxima = depth.maxDepth(depth.getRoot());
        System.out.println("\n\nOUTPUT:" + profundidadMaxima);
        scanner.close();
    }

    //HECHO EN CLASE:

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
}
