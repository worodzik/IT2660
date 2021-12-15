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
public class DepthFirst {
    public DepthFirst(){
        
    }
  

   public int dfs(DFSNode node, LinkedList<DFSNode> list)
   {
       int count = 0;
       Stack<DFSNode> s = new Stack<>();
       s.add(node);

       while (!s.isEmpty())
       {
           count++;
           DFSNode currNode = s.pop();
           if (!currNode.isVisited())
           {
               list.add(currNode);
               currNode.setVisited(true);
           }

           LinkedList<DFSNode> neighbours = currNode.getNeigh();
           for (int i = 0; i < neighbours.size(); i++)
           {
               count++;
               DFSNode temp = neighbours.get(i);
               if (temp != null && !temp.isVisited())
               {
                   s.add(temp);
               }
           }
       }

       return count;
   }
}
