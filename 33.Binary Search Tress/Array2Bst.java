

public class Array2Bst {
    static class Node{
        int data;
        Node right,left;

       public  Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
   public static Node array2Bst(int arr[],int st,int end){
    if(st > end){
        return null;
    }
    int mid = (st+end )/2;
    Node root= new Node(arr[mid]);
    root.left = array2Bst(arr,st,mid-1);
    root.right =array2Bst(arr,mid+1,end);
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
       int arr[]={3,5,6,8,10,11,12};
       Node  root = array2Bst(arr,0,arr.length-1);
       preorder(root);
    }
}