public class PrintInRange{
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data= data;
            this.left=null;
            this.right= null;

        }
    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    
    }

    public static void search(Node root ,int start,int end){
       if(root ==null){
            return ;
        }
        if(start <= root.data  && root.data <= end){
           search(root.left,start,end);
           System.out.print(root.data+" ");
           search(root.right,start,end);
        }
        else if(root.data > end ){
            search(root.left,start,end);
        }
        else{
            search(root.right,start,end);
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
    public static void main(String args[]){
     int values[]= {8,5,3,1,4,6,10,11,14};

        Node root = null;
        for(int i=0;i<values.length;i++){
            root =insert(root,values[i]);
        }
        // inorder(root);
        search(root,5,12);
}
}