import java.util.*;

public class InsertHeap {
    static class Heap{
        ArrayList<Integer> arr= new ArrayList<>();

        public void add(int data){
            //add at the last idx
            arr.add(data);
            int x = arr.size()-1;

            int paridx=(x-1)/2;//parent index

            while(arr.get(x) < arr.get(paridx)){//)(log n)
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(paridx));
                arr.set(paridx,temp);
                x=paridx;
                paridx=(x-1)/2;
            }
        }
    }
    public static void main(String args[]){

    }
}
