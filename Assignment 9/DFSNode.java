/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
import java.util.*;
public class DFSNode {
    private int data;
   private boolean visited;
   private LinkedList<DFSNode> neigh;

   DFSNode(int d)
   {
       data = d;
       neigh = new LinkedList<>();
   }

   public int getData()
   {
       return data;
   }

   public void setData(int d)
   {
       data = d;
   }

   public boolean isVisited()
   {
       return visited;
   }

   public void setVisited(boolean v)
   {
       visited = v;
   }
  
   public void addNeigh(DFSNode n)
   {
       neigh.add(n);
   }

   public LinkedList<DFSNode> getNeigh()
   {
       return neigh;
   }

   public void setNeighbours(LinkedList<DFSNode> n)
   {
       neigh = n;
   }

   public String toString()
   {
       return "" + data;
   }
}
