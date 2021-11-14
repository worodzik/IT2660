/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class Listing {
    private Node root;
    private Node last;
    private int size;
    
    public Listing(Node node){
        root = node;
        last = node;
        size = 1;
    }
    
    public void append(Node node){
        last.setNextNode(node);
        last = node;
        size++;
    }
    public void insertAt(Node node, int pos){
        if (pos == 0)
            insertNewRoot(node);
        else if (pos == size)
            append(node);
        else
            insert(node, pos); 
    }
    public void insertNewRoot(Node node){
        node.setNextNode(root);
        root = node;
        size++;
        
    }
    public void insert(Node node, int ind){
        Node target = getNode(ind, false);
        node.setNextNode(target.getNextNode());
        target.setNextNode(node); 
    }
    public void print(){
        System.out.println("List Size: " + size);
        getNode(size, true);
    }
    public Node getNode(int pos, boolean print){
        Node s = root;
        for(int i =1; i<=pos; i++){
            if(print){
                System.out.println(s.getValue());
            }
            s = s.getNextNode();
        }
        return s;
    }
    
}
