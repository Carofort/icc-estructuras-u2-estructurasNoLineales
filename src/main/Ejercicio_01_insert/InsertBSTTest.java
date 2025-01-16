package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBSTTest {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if (node == null)
            return new Node(value);

        if(value < node.getValue()){
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()){
            node.setRight(insert(node.getRight(), value));
        }

        return node;
    }

    public void imprimirArbol() {
        imprimirArbolRecursivo(root, 0);
    }

    private void imprimirArbolRecursivo(Node nodo, int nivel) {
        if (nodo == null) {
            return;
        }
        imprimirArbolRecursivo(nodo.getRight(), nivel + 1);
        System.out.println("  ".repeat(nivel) + nodo.getValue());
        imprimirArbolRecursivo(nodo.getLeft(), nivel + 1);
    }
}
