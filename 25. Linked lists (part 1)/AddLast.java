//time complexity: constant time operation

public class AddLast {
    public static void main(String args[]){
        AddLast ll =new AddLast();
        ll.addLast(8);  ll.addLast(4);
    }
    public static class Node{
        int data;
        Node next;
        //constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  void addLast(int data){//O(1)
        //step 1 create a node
        Node newNode= new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        //step 2
        tail.next= newNode;
        //step 3
        tail =newNode;
    }

}
