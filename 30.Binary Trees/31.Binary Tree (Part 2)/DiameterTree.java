//approach 1
public class DiameterTree{
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }

       
    }
    public static int heightTree(Node root){
        if( root  == null){
            return 0;
        }
        int lh =heightTree(root.left);
        int rh =heightTree(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){//O(n^2)
        if(root == null){
            return 0;
        }

        int leftdiam = diameter(root.left);
        int lht =heightTree(root.left);
        int rightdiam = diameter(root.right);
        int rht =heightTree(root.right);

        int selfDiam = lht +rht+1;

        return Math.max(selfDiam,Math.max(leftdiam,rightdiam));
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(diameter(root));

    }
   
}


