package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
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

    private Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }

        return node;
    }

    public int maxDepth(Node root){
        if (root == null) {
            return 0; 
        }

        int profundidadIzquierda = maxDepth(root.getLeft());
        int profundidadDerecha = maxDepth(root.getRight());

        return 1 + Math.max(profundidadIzquierda, profundidadDerecha);
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
