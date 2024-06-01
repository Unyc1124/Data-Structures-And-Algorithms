//check if linked list is palindrome or not
public class Palindrome {
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
        public  int size;//java initialize apne ap value zero se
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

        public int removeFirst(){
            if(head==null ||size ==0){//case 1 list khali h
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size ==1 ||head==tail){//case 2 list me ek hi h element
                int val= head.data;
                head =tail=null;
                size =0;
                return val;
            }
            int val =head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast(){
            if(size==0 || head ==null){
                System.out.println("Linked List is Empty");
                return Integer.MIN_VALUE;
            }
            else if(size ==1){
                int val= head.data;
                head=tail=null;
                size=0;
                return val;
            }
            //prev : i = size-2
            Node prev =head;
            for(int i=0;i<size-2;i++){
                prev = prev.next;
            }
            int val=prev.next.data;//tail.data
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        //slow-fast approach
        public Node findMid( Node head){//helper fxn
            Node slow =head;
            Node fast =head;
            while(fast!=null && fast.next!=null){
                slow =slow.next;//+1 turtle
                fast = fast.next.next;//+2 hare
            }
            return slow;//slow is my middle
        }
        public boolean checkPalindrome(){
            if(head ==null || head.next== null){
                return true;
            }
            //step 1:find mid
            Node midNode= findMid(head);
            //step 2: reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev =curr;
                curr = next;
            }
            Node right= prev; //right half head
            Node left= head;
            //step 3: check left half and right half
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        public static void main(String args[]){
           Palindrome ll= new Palindrome();
            ll.addFirst(1); ll.addLast(2); ll.addLast(2); ll.addLast(1);
            ll.print();
            System.out.println(ll.checkPalindrome());
        }
    }














