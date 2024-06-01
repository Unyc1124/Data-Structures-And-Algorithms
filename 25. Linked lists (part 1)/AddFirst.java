//time complexity constant O(1)
public class AddFirst {
    public static class Node{
        int data;
        Node next;//node type ka next reference variable in java ptr ka kaam krta h
        //constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){//O(n)

        //step 1 create a node
        Node newNode = new Node(data);//normal jaise class ka object banate h
        if(head==null){
         head=tail=newNode;
         return;
        }
        //Step 2 newNode ke next me assign kardo head ki value
        newNode.next =head;//linking ek node ko dusre node se
        //Step 3 head= newNode
        head = newNode;
    }
    public static void main(String args[]){
        AddFirst ll=new AddFirst();
        ll.addFirst(1);
        ll.addFirst(2);

    }

}