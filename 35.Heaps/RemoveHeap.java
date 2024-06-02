
  import java.util.*;
public class RemoveHeap {//min-heap code
  
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
                x=paridx;//pointer update
                paridx=(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){//O(log n)
            int  lidx = 2*i+1;
            int ridx = 2*i+2;
            int minidx = i;

            if(lidx < arr.size() && arr.get(lidx) < arr.get(minidx)){
                minidx = lidx;
            }

              if(ridx < arr.size() && arr.get(ridx) < arr.get(minidx)){
                minidx = ridx;
            }

            if(minidx != i){

                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                //for baki ke nodes-top down approach
                heapify(minidx);
            }

        }

        public int remove(){//O(log n)
            int data = arr.get(0);

            //step 1- swap first and last nodes
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step 2 - delete last
            arr.remove(arr.size()-1);

            //step 3 -heaapify -private function 
            heapify(0);

            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap h= new Heap();
        h.add(3);  h.add(4);
          h.add(1);  h.add(5);

          while(!h.isEmpty()){//heap sort
            System.out.println(h.peek());
            h.remove();
          }//replace h => pq implementation will be similar to priority queue
    }
}


//max heap keliye 3 jagah sign change kardo