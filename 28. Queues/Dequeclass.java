//double eneded queues
import java.util.*;

public class Dequeclass {
    public static void main(String args[]){
        //already an interface named deque
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        System.out.println("First element is : "+deque.getFirst());
        System.out.println("last element is : "+deque.getLast());



    }
}
