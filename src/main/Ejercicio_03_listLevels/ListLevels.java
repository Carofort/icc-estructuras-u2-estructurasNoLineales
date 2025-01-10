package main.Ejercicio_03_listLevels;

import java.util.List;

import main.Materia.Models.Node;

public class ListLevels {
    
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> lista;
        if(root == null){
            return null;
        }

        if(root.getLeft() != null){
            System.out.println(root);
            System.out.println();
            listLevels(root.getLeft());
            System.out.println(root);
        }
    }
}
