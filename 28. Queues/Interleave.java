//interleave 2 halves of a queue (even length)
import java.util.*;

public class Interleave {
    public static void main(String args[]){
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3); queue1.add(4); queue1.add(5);
        queue1.add(6); queue1.add(7); queue1.add(8); queue1.add(9); queue1.add(10);
        interLeave(queue1);
        //print interleaved queue
        while(!queue1.isEmpty()){
            System.out.print(queue1.remove()+" ");
        }

    }

    public static void interLeave( Queue<Integer> queue1 ){
        //making temp queue to transfer half els of queue1 to temp
        Queue<Integer> tempqueue = new LinkedList<>();
        int size = queue1.size();//ye imp h kyuki agr hum loop me direct lik denge toh wo variable hojata h 
        for(int i =0;i<size/2;i++){
         tempqueue.add(queue1.remove());//og queue me se nikal rhe h temp me daal rhe h  
        }
        //transfer hone ke baad final interleaving 
        while(!tempqueue.isEmpty()){
            queue1.add(tempqueue.remove());
            queue1.add(queue1.remove());

        }

    }
}
