/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */

public class BinarySearchTreeNode  {
   BinarySearchTreeNode l, r; // left and right childs
   Listing contant;
   public BinarySearchTreeNode(Listing list){
       l = null;
       r = null;
       contant = list;
   }
   public BinarySearchTreeNode getL(){
       return l;
    }
   public BinarySearchTreeNode getR(){
       return r;
   }
   public Listing getContant(){
       return contant;
   }
   public void setL(BinarySearchTreeNode newL){
       l = newL;
   }
   public void setR(BinarySearchTreeNode newR){
       r = newR;
   }
   
   public void setContant(Listing newC){
       contant = newC;
   }
   
   
}
