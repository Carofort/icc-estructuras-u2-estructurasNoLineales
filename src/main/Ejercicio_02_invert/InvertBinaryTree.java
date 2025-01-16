package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

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

    public void invertirArbol() {
        root = invertirArbol(root);
    }

    private Node invertirArbol(Node node) {
        if (node == null) {
            return null;
        }

        Node temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);

        invertirArbol(node.getLeft());
        invertirArbol(node.getRight());

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
