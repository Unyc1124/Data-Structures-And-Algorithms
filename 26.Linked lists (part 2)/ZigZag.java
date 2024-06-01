//time complexity:linear time O(n)
public class ZigZag {
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
    public int size;
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
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast =head.next;
        while(fast!=null && fast.next!= null){
            slow = slow.next ;//+1
            fast =fast.next.next;//+2
        }
        Node mid =slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next =null;
        Node prev =null;
        Node next ;
        while(curr!=null){
            next =curr.next ;
            curr.next = prev;
            prev = curr;
            curr =next ;

        }
        Node left= head;
        Node right = prev ;
        Node nextL , nextR;

        //alterante merging or zigzag merge
        while(left!=null && right != null) {
            nextL= left.next;
            left.next =right;
            nextR = right.next;
            right.next =nextL;
            //update
            left = nextL;
            right = nextR;
        }

    }

    public static void main(String args[]){
     ZigZag ll= new ZigZag();
     ll.addLast(1); ll.addLast(2); ll.addLast(3); ll.addLast(4);ll.addLast(5);
       //1-2-3-4-5
       ll.print();
       ll.zigZag();
       ll.print();

    }
}

