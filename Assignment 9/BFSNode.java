

/**
 *
 * @author worod
 */
import java.util.LinkedList;
public class BFSNode {
    private int data;
    private boolean visited;
    private LinkedList<BFSNode> neigh;
    public BFSNode(int d)
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
  
   public void addNeigh(BFSNode n)
   {
       neigh.add(n);
   }

   public LinkedList<BFSNode> getNeigh()
   {
       return neigh;
   }

   public void setNeigh(LinkedList<BFSNode> n)
   {
       neigh = n;
   }

    @Override
   public String toString()
   {
       return "" + data;
   }
}
