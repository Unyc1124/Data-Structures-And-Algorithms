import java.util.*;
//queue interface h class nhi isisliye uske objects nhi bn skte h  interface ko implement krti h ll class and ArrayDeque
public class QueueJCF {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
        
    }
}
