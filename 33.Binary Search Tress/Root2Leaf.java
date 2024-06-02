import java.util.*;

public class Root2Leaf {
    static class Node{
        int data;
        Node right,left;

       public  Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root ==null){
            root =new Node(val);
            return root;
        }

        if(root.data>val){
            //left subtree
            root.left= insert(root.left,val);
            }
            else{
                root.right =insert(root.right,val);
            }
            return root;
    }
    public static void inorder (Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void printPath(  ArrayList<Integer> path){
         System.out.println();
        for (int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    
    }

    public static void root2Leaf(Node root, ArrayList<Integer> path){
       
        if(root == null){
            return;
        }
        path.add(root.data);   
        if(root.left == null && root.right ==null){
            printPath(path);
        }
        root2Leaf(root.left,path);
        root2Leaf(root.right,path);
        path.remove(path.size()-1);//index pass kr dia jaha se remove krna h

    }
   
    public static void main(String args[]){
        int values[]= {8,5,3,1,4,6,10,11,14};

        Node root = null;
        for(int i=0;i<values.length;i++){
            root =insert(root,values[i]);
        }
        inorder(root);
        root2Leaf(root, new  ArrayList<>());
    }
}