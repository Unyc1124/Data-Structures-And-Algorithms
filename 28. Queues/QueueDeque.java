import java.util.*;

public class QueueDeque {
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public void enqueue(int data){
            deque.addLast(data);
        }
        public int dequeue(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        Queue queue = new Queue();
        queue.enqueue(0);queue.enqueue(1);queue.enqueue(2);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

     
    }
}
