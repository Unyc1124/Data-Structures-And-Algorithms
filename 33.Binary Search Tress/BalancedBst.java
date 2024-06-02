import java.util.*;

public class BalancedBst{
    static class Node{
        int data;
        Node right,left;

       public  Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
     public static Node array2Bst(ArrayList<Integer> inorder,int st,int end){
    if(st > end){
        return null;
    }
    int mid = (st+end )/2;
    Node root= new Node(inorder.get(mid));
    root.left = array2Bst(inorder,st,mid-1);
    root.right =array2Bst(inorder,mid+1,end);
    return root;
   }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left ,inorder);
        inorder.add(root.data);
        getInorder(root.right ,inorder);
    }
      public static Node balancedBst(Node root){
        //to cal inorder seq
         ArrayList<Integer> inorder= new ArrayList<>();
         getInorder(root ,inorder);
        //sorted inorder -> balanced tree
        root = array2Bst(inorder,0,inorder.size()-1);
        return root;

      }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


   
    public static void main(String args[]){
        Node root= new Node(8);
          root.left=new Node(6);
        root.left.left=new Node(5);
  
        root.left.left.left= new Node(3);
            root.right=new Node(10);
        root.right.right=  new Node(11);
        root.right.right.right=  new Node(12);

       root =balancedBst(root);
       preorder(root);
}
}