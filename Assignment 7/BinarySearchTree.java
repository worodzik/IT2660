/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author worod
 */
public class BinarySearchTree {
   private BinarySearchTreeNode root;
   public BinarySearchTree(){
       root = null;
   }
   
   public boolean empty(){
       return root == null;
   }
   
   public void insertNode(Listing contant){
       root = insert(root,contant);
   }
   
   
    private BinarySearchTreeNode insert(BinarySearchTreeNode bnode, Listing c){
       
       if(bnode == null){
           bnode = new BinarySearchTreeNode(c);
       }
       
       else if (bnode != null){
           if (c.compareTo(bnode.getContent().getName())<=0){
               bnode.l = insrt(bnode.l, c);
           }
           else{
               bnode.r = insert(bnode.r, c);
           }
       }
       return bnode;
   }
    public void deleteNode(String e){
        if(empty())
            System.out.println("The Tree is Empty");
        else if (fetch(e)==false)
            System.out.println("the object not found");
        else if (fetch(e)==true){
            root = delete(root, e);
            System.out.println("the object was deleted");
        }
    }
    private BinarySearchTreeNode delete(BinarySearchTreeNode r, String ob){
        BinarySearchTreeNode req, temp , del;
        if(r.getContant().getName().equalsIgnoreCase(ob)){
            BinarySearchTreeNode left, right;
            left = r.getL();
            right = r.getR();
            if (right == null){
                req = left;
                return req;
            }
            else if (left == null){
                req = right;
                return req;
            }
            else{
                temp = right;
                req = right;
                while(req.getL()!= null){
                    req = req.getL();
                }
                req.setL(left);
                return temp;
            }
        }
        if (ob.compareTo(r.getContant().getName())<0){
            del = delete(r.getL(),ob);
            r.setL(del);
        }
        else{
            del = delete(r.getR(),ob);
            r.setR(del); 
        }
        return r;
    }
    
    public boolean fetch(String f){
        return searchNode(root,f);
    }
    public boolean searchNode(BinarySearchTreeNode r, String f){
        boolean isExist;
        isExist = false;
        while ((r!=null)&& !isExist){
            String rval = r.getContant().getName();
            if(f.compareTo(rval)>0)
                r = r.getR();
            else if(f.compareTo(rval)<0)
                r = r.getL();
            else{
                System.out.println("Search result value: \n" + r.contant);
                isExist = true;
                break;
            }
             isExist = searchNode(r,f) ;
        }
        return isExist;
    }
}
