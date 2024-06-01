// import java.util.*;
public class Diameter2 {
    static class Node{
        int data;
        Node right,left;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        int diameter;
        int ht;

        public Info(int diameter,int ht){
            this.diameter=diameter;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){//O(n)
        if(root == null){
            return new Info(0, 0);
        }
        //left ka info
        Info leftInfo = diameter(root.left);
        //right ka info
        Info rightInfo = diameter(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diameter, ht);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print(diameter(root).diameter);
    }
}
