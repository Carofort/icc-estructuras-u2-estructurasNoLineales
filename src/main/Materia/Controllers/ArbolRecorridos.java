package main.Materia.Controllers;

import java.util.Stack;

import main.Materia.Models.Node;

public class ArbolRecorridos {

    public void preOrderIterativo(Node root){

        //Verificar si no está vacio
        if(root == null){
            return;
        }

        // Pila para manejar los nodos del arbol durante el recorrido
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.print(node.getValue() + ", ");

            if(node.getRight() != null){
                stack.push(node.getRight());
            }

            if(node.getLeft() != null){
                stack.push(node.getLeft());
            }
        }

    }

    public void preOrderRecursivo(Node node){

        //Verificar si el nodo está vacio
        if(node != null){
            //Imprimir valor actual
            System.out.print(node.getValue() + ", ");
            preOrderRecursivo(node.getLeft());
            //Queda en pausa
            preOrderRecursivo(node.getRight());            
        }
    }

    public void postOrderRecursivo(Node node){

        if(node != null){
            postOrderRecursivo(node.getLeft());
            postOrderRecursivo(node.getRight());  
            System.out.print(node.getValue() + ", ");         
        }
    }

    public void inOrderRecursivo(Node node){

        if(node != null){
            inOrderRecursivo(node.getLeft());
            System.out.print(node.getValue() + ", ");
            inOrderRecursivo(node.getRight());            
        }
    }
}
