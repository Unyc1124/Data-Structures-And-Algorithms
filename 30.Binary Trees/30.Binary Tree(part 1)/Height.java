public class Height {
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
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(heightTree(root));

    }
   
}
