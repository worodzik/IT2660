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
public class BreadthFirst {
     public BreadthFirst(){
         
     }
   

   public int bfs(BFSNode node, LinkedList<BFSNode> list)
   {
       int count = 0;
       Queue<BFSNode> q = new LinkedList<>();

       q.add(node);
       node.setVisited(true);

       while (!q.isEmpty())
       {
           BFSNode currNode = q.remove();
           list.add(currNode);
           LinkedList<BFSNode> neighbours = currNode.getNeigh();
           for (int i = 0; i < neighbours.size(); i++)
           {
               count++;
               BFSNode temp = neighbours.get(i);
               if (temp != null && !temp.isVisited())
               {
                   q.add(temp);
                   temp.setVisited(true);                  
               }
           }
       }

       return count;
   }

    

}
