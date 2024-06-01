public class RemoveACycle {
    
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
    public static int size;
    public static boolean isCycle(){//Floyd's cycle finding algorithm
       Node slow = head;
       Node fast = head ;
       while(fast!=null && fast.next!=null){
        slow =slow.next;//+1
        fast = fast.next.next;//+2 
        if(slow ==fast){
            return true;//cycle exists
        }
       }
        return false;//no cycle
    }
    
    
    public static void main(String args[]){
        head = new Node(1);
        Node temp =new Node(2);
        head.next = temp;
        head.next.next=new Node(3);
        head.next.next.next =new Node(4);
        head.next.next.next.next =temp;
        //1->2->3->1 cycle example
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

        
    }
  
    public static void removeCycle(){
        //detect cycle
        Node slow= head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!= null){
            slow=slow.next;//+1
            fast = fast.next.next;//+2
            if(slow == fast){
                cycle =true;
                break;
            }

        }
        if(cycle==false){
            return;
        }

        //finding meeting point
        slow = head;
        Node prev = null;
        while(slow!= head){
            prev = fast;
            slow=slow.next;
            fast = fast.next;
        }
        //remove cycle-> last.next=null
        prev.next = null;
    } 
}
