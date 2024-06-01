public class LinkedList {
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
    public void addFirst(int data){
        //step 1 create a node
     Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //Step 2 newNode ke next me assign kardo head ki value
        newNode.next =head;//linking ek node ko dusre node se
        //Step 3 head= newNode
        head =newNode;
    }
    public  void addLast(int data){
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

    public void print(){
        if(head ==null){
            System.out.println("Linked List empty");
            return;
        }
        Node temp =head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
       LinkedList ll=new LinkedList();
       ll.print();
       //add first
        ll.addFirst(1);ll.addFirst(2);
        ll.print();
        //add last
        ll.addLast(8);  ll.addLast(4);
        ll.print();

    }

}
