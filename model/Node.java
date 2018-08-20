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
public class Node {
    private int stateNumber;
    private ArrayList<Node> pNext = new ArrayList<Node>();
    private boolean startState;
    private boolean finalState;
    private ArrayList<String> inputs = new ArrayList<String>(); 
    private boolean isVisited;

    public Node(int stateNumber, boolean startState, boolean finalState, ArrayList<String> inputs) {
        this.stateNumber = stateNumber;
        this.startState = startState;
        this.finalState = finalState;
        this.inputs = inputs;
        isVisited = false;
    }

    public int getStateNumber(){
        return stateNumber;
    }
    
    public boolean isStart(){
        return startState;
    }
    
    public boolean isFinal(){
        return finalState;
    }
    
    public void addNext(Node node){
        pNext.add(node);
    }
    
    public ArrayList<Node> getNext(){
        return pNext;
    }
    
    public boolean getIsVisited(){
        return isVisited;
    }
    
    public void setIsVisited(boolean value){
        isVisited = value;
    }
}
