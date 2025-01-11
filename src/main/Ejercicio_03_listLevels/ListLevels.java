package main.Ejercicio_03_listLevels;

import java.util.*;

import main.Materia.Models.Node;

public class ListLevels {
    
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> lista = new ArrayList<>();
        if(root == null){
            return null;
        }

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);
        
        while(!cola.isEmpty()){
            int nivel = cola.size();
            List<Node> nivelAct = new ArrayList<>();

            for(int i = 0; i < nivel; i++){
                Node actual = cola.poll();
                nivelAct.add(actual);

                if(actual.getLeft() != null){
                    cola.add(actual.getLeft());
                }

                if(actual.getRight() != null){
                    cola.add(actual.getRight());
                }
            }
             
            lista.add(nivelAct);
        }  
        return lista;           
    }
   
}
