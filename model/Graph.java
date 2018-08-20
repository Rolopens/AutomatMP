/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Random;



/**
 *
 * @author Rolo
 */
public class Graph {
    private ArrayList<Node> Nodes = new ArrayList<Node>();
    private ArrayList<Node> startStates = new ArrayList<Node>();
    private ArrayList<Node> finalStates = new ArrayList<Node>();
    private Node current; //where the graph is pointing at in the graph
    
    Random rand = new Random();
    
    public void appendNode(Node node){
        Nodes.add(node);
        this.findFinalStates();
        this.findStartStates();
        
        //get random start state for the graph
        int  n = rand.nextInt(startStates.size()) + 0;
        current = startStates.get(n);
        
    }
    
    private void findFinalStates(){
        for (int i = 0; i < Nodes.size(); i++){
            if(Nodes.get(i).isFinal()){
                finalStates.add(Nodes.get(i));
            }
        }
    }
    
    private void findStartStates(){
        for (int i = 0; i < Nodes.size(); i++){
           if(Nodes.get(i).isStart()){
                startStates.add(Nodes.get(i));
            }
        }
    }

    public ArrayList<Node> getNodes() {
        return Nodes;
    }

    public Node getCurrent() {
        return current;
    }
    
    //function to be used when graph object will move the current node
    //this function will be used for finding the solution
    public ArrayList<Node> findSolution(ArrayList<Node> solutionPath){
//        if(current.isFinal()){
//            solutionPath.add(current);
//            return solutionPath;
//        }
//        else{
//            solutionPath.add(current);
//            current.setIsVisited(true);
//            for (int i = 0; i < current.getNext().size(); i++){
//                if (current.getNext().get(i).getIsVisited() == false){
//                    current = current.getNext().get(i);
//                    break;
//                }
//            }
//            return findSolution(solutionPath);
//        }
        return null;
    }
    
    //function to be used when user inputs a character: human, human, lion, cow, grain
    public void moveCurrentViaInput(String input){
        
    }
    
}

