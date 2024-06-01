// ..implemetation using linked list -microsoft interview
public class QueueisLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next =null;
        }
    }
    static class CQueue{

    static Node head=null;
    static Node tail =null;
    


    public boolean isEmpty(){
        return head == null && tail ==null;
    }
    //add
    public void add(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }
    //remove
    public int remove(){
        if(isEmpty()){
            System.out.println("EMpty queue");
            return -1;
        }
       int front =head.data;
       if(tail == head){
        tail = head = null;
       }else{
        head = head.next;

       }
       return front;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return head.data;
    }
    }

    
    public static void main(String args[]){
        CQueue q = new CQueue();
        q.add(1);
        q.add(2);
        q.add(3);
 
        while(!q.isEmpty()){
         System.out.println(q.peek());
         q.remove();
        }
 
     }
}

