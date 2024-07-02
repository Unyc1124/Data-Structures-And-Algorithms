public class DoublyLL {
    public class Node{//Doubly linked list structure
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    //addfirst-operation
    public  void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){//or size=0 bhi chalega
            head = tail = newNode;
            return;
        }

        newNode.next =head;
        head.prev = newNode;
        head = newNode;
       

    }

    //removeFirst -opeartion
    public int removeFirst(){
        if(head == null){//edge case 1
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){//agr size 1 hai
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head =head.next;
        head.prev=null;
        size--;
        return val;
    }

    public void printNodes(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        DoublyLL dll= new DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printNodes();
        System.out.println(size);

        dll.removeFirst();
        dll.printNodes();
        System.out.println(size);
    }
}
