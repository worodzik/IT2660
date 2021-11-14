/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class Node {
    private String name;
    private int id;
    private double avg;
    private Node nextNode;
    
    public Node(String n, int i, double a){
        name = n;
        id = i;
        avg = a;
    }
    
    public String getValue(){
        return "name is " + name + " id = " + id + " average = " + avg;
    }
    public Node getNextNode(){
        return nextNode;
    }
    
    public void setNextNode(Node next){
        nextNode = next;
    }
}