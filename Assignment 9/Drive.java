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
public class Drive {

    
    public static void main(String[] args) {
        int nOfn = 1000;
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        LinkedList<BFSNode> bfsN = new LinkedList<>();
        LinkedList<DFSNode> dfsN = new LinkedList<>();
        for (int i = 0; i < nOfn; i++)
       {
           int n = 1 + r.nextInt(100000);
           System.out.println(n);
           bfsN.add(new BFSNode(n));
           dfsN.add(new DFSNode(n));
  
       }
       System.out.println("/////////////");
       for (int i = 0; i < nOfn; i++)
       {
           int conn = 1 + r.nextInt(5);

           for (int j = 0; j < conn; j++)
           {
               int k = r.nextInt(nOfn);

               bfsN.get(i).addNeigh(bfsN.get(k));
               dfsN.get(i).addNeigh(dfsN.get(k));
           }
       }
       
       System.out.print("Pick a number between 1 and 100,000: ");
       int number = keyboard.nextInt();
       

       BFSNode bfsNum = findBFSNode(bfsN, number);
       DFSNode dfsNum = findDFSNode(dfsN, number);
       
       String result = "Failed";
       int bfsLength = 0;
       int bfsCount = 0;
       int dfsLength = 0;
       int dfsCount = 0;
       
       if (bfsNum != null && dfsNum != null )
       {
           result = "Succsess";
          
           LinkedList<BFSNode> bfsList = new LinkedList<>();
           LinkedList<DFSNode> dfsList = new LinkedList<>();
           
          
           BreadthFirst bfsObj = new BreadthFirst();
           bfsCount = bfsObj.bfs(bfsNum, bfsList);
           bfsLength = bfsList.size();
          
           DepthFirst dfsObj = new DepthFirst();          
           dfsCount = dfsObj.dfs(dfsNum, dfsList);
           dfsLength = dfsList.size();  
          
            
           
       }
      
       System.out.println("Breadth-First: " + result);
       System.out.println("Length of shortest path = " + bfsLength);
       System.out.println("Total number of nodes examined: " + bfsCount);          
       System.out.println("Depth-First: Success");
       System.out.println("Length of shortest path = " + dfsLength);
       System.out.println("Total number of nodes examined: " + dfsCount);
    }
   private static BFSNode findBFSNode(LinkedList<BFSNode> bfsNodes, int n)
   {
       for (int i = 0; i < bfsNodes.size(); i++)
       {
           if (bfsNodes.get(i).getData() == n)
               return bfsNodes.get(i);
       }

       return null;
   }

   private static DFSNode findDFSNode(LinkedList<DFSNode> dfsNodes, int n)
   {
       for (int i = 0; i < dfsNodes.size(); i++)
       {
           if (dfsNodes.get(i).getData() == n)
               return dfsNodes.get(i);
       }

       return null;
   }

  
}
