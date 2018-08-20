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
    private ArrayList<Node> pPrev = new ArrayList<Node>();
    private boolean startState;
    private boolean finalState;
    private ArrayList<String> inputs = new ArrayList<String>(); 

    public Node(int stateNumber, boolean startState, boolean finalState, ArrayList<String> inputs) {
        this.stateNumber = stateNumber;
        this.startState = startState;
        this.finalState = finalState;
        this.inputs = inputs;
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
    
    public void addPrev(Node node){
        pPrev.add(node);
    }
}
