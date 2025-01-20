package main.Materia.Controllers;

import java.util.*;

import main.Materia.Models.NodeG;

public class Graph {
    
    private List<NodeG> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeG addNode(int value){

        NodeG nodeGraph = new NodeG(value);
        nodes.add(nodeGraph);
        return nodeGraph;

    }

    public void addEdge(NodeG src, NodeG dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src); //grafo no dirigido
    }

    public void addEdgeUni(NodeG src, NodeG dest){
        src.addNeighbor(dest);
    }

    public void printGraph(){
        for(NodeG nodeGraph : nodes){
            System.out.print("Vértice " + nodeGraph.getValue() + ": ");
            for(NodeG nei : nodeGraph.getNeighbors()){
                System.out.print(nei.getValue() + " -> ");
            }
            System.out.println();
        }

    }

    
    
    public void getDFS(NodeG startNode){
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el node " + startNode.getValue() + " :");
        getDFSUtil(startNode, visitados);
        System.out.println();

    }

    private void getDFSUtil(NodeG node, Set<NodeG> visitados){
        if(visitados.contains(node)){
            return;
        }

        System.out.print(node.getValue() + " ");
        visitados.add(node);

        for(NodeG neighbor : node.getNeighbors()){
            getDFSUtil(neighbor, visitados);
        }

    }

    public void getBFS(NodeG startNode){
        Set<NodeG> visitados = new HashSet<>();
        Queue<NodeG> cola = new LinkedList<>();

        System.out.println("BFS desde el node " + startNode.getValue() + " :");
        cola.add(startNode);
        visitados.add(startNode);

        while(!cola.isEmpty()){
            NodeG actual = cola.poll();
            System.out.print(actual.getValue() + " ");
            for(NodeG neighbor : actual.getNeighbors()){
                if(!visitados.contains(neighbor)){
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
        }

    }

    public void getDFSEjercicio(NodeG startNode, NodeG destino){
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el node " + startNode.getValue() + "hasta el nodo " + destino.getValue() + " :");
        getDFSUtilEjercicio(startNode, destino, visitados);
        System.out.println();

    }

    private void getDFSUtilEjercicio(NodeG node, NodeG destino, Set<NodeG> visitados){
        if(visitados.contains(node)){
            return;
        }
        
        System.out.print(node.getValue() + " ");
        visitados.add(node);

        for(NodeG neighbor : node.getNeighbors()){
            if(visitados.contains(destino)){
                return;
            }
            getDFSUtilEjercicio(neighbor, destino, visitados);
        } 
       
    }

     /* 
    public int[][] getAdjacencyMatrix(){

    }

    public void printAdjacencyMatrix(){

    }
   */
 
}
