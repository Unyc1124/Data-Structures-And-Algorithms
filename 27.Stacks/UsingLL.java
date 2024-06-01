//implementing stack using linked lists - very important amazon , oyo
public class UsingLL{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();//Lifo fashion
        }
    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next =null;
        }
    }
    static class Stack{
        static Node head = null;

        public boolean isEmpty(){
            return head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop fxn 
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek fxn 
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    } 
}