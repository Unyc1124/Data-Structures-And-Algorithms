import java.util.*;
public class QueueReversal {
    public static void main(String args[]){
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1); queue.add(2); queue.add(3);
        queue.add(4);queue.add(5);queue.add(6);
        queueReversal(queue);

    }
    public static void queueReversal(Queue<Integer> queue){
        Stack<Integer> tempstack= new Stack<>();
        // int size = queue.size();
        // for(int i =0;i<size;i++){
            while(!queue.isEmpty()){
            tempstack.push(queue.remove());
        }
        System.out.print("Reversed queue is : ");
        while(!tempstack.isEmpty()){
        System.out.print(tempstack.pop()+" "); 
        }
    }
}
