package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

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
        dest.addNeighbor(src);

    }

    public void printGraph(){
        for(NodeG nodeGraph : nodes){
            System.out.print("Vértice " + nodeGraph.getValue() + ": ");
            for(NodeG nei : nodeGraph.getNeighbors()){
                System.out.print(nei.getValue() + " - ");
            }
            System.out.println();
        }

    }

    /*
    public void getDFS(NodeG startNode){

    }

    private void getDFSUtil(NodeG node, boolean[] visited){

    }

    public void getBFS(NodeG startNode){

    }

    public int[][] getAdjacencyMatrix(){

    }

    public void printAdjacencyMatrix(){

    }
     */
}
