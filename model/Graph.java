/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Rolo
 */
public class Graph {
    private ArrayList<Node> Nodes = new ArrayList<Node>();
    private Node current; //where the graph is pointing at in the graph
    
    public void appendNode(Node node){
        Nodes.add(node);
        
    }

    public ArrayList<Node> getNodes() {
        return Nodes;
    }


    public Node getCurrent() {
        return current;
    }
    
}
