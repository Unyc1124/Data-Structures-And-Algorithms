public class SumOfNodes {
   
        static class Node{
            int data;
            Node left,right;
    
            Node(int d){
                this.data = d;
                this.right = null;
                this.left = null;
            }
        }
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int lsum=sumOfNodes(root.left);
            int rsum=sumOfNodes(root.right);
            return lsum+rsum+root.data;
    
            
        }
        public static void main(String args[]){
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            // root.right.right = new Node(7);
            System.out.print(sumOfNodes(root));
        }
}
    

