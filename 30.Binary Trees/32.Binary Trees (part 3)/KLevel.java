public class KLevel{
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void kLevel(Node root,int k,int level){
        if(root ==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, k, level+1);
        kLevel(root.right, k, level+1);
    }
    public static void main(String args[]){
         //tree
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
        //  int k =2;
         kLevel(root,2,1);
    }
}