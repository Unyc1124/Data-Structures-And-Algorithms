
public class SizeLl {
        public static class Node{
            int data;
            Node next;
            //Constructor
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;
        public static int size;//java initialize apne ap value zero se
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

        public  void addLast(int data){
            //step 1 create a node
            Node newNode= new Node(data);
            size++;
            if(head == null){
                head=tail=newNode;
                return;
            }
            //step 2
            tail.next= newNode;
            //step 3
            tail =newNode;
        }

        public  void addFirst(int data){
            //step 1 create a node
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            //Step 2 newNode ke next me assign kardo head ki value
            newNode.next =head;//linking ek node ko dusre node se
            //Step 3 head= newNode
            head =newNode;
        }
        public void addMiddle(int idx,int data){
            if(idx==0){
                addFirst(data);//kyuki list ke start me kuch nhi h so head ko handle krne padega isiliye
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp= head;
            int i=0;

            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            //i=idx-1;temp->prev
            newNode.next = temp.next;
            temp.next =newNode;

        }

        public static void main(String args[]){
            AddMiddle ll= new AddMiddle();
            ll.addFirst(1); ll.addFirst(2); ll.addLast(3); ll.addLast(4);
            ll.addMiddle(2,5);
            ll.print();
            System.out.println(ll.size);

        }
    }


