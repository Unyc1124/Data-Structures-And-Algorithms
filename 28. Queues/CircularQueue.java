public class CircularQueue {
    static class CQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public CQueue(int n){
            arr = new int[n];
            size = n;
            rear =-1;
            front =-1;

        }
        public  boolean isEmpty(){
            return rear == -1 && front==-1;
        }

        public  boolean isFull(){
            return (rear+1)%size == front ;
        }

        //add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ; 
            }
            //add 1st element
            if(front == -1){
                front =0;

            }
            rear = (rear +1)%size;
            arr[rear]= data;
            
        }
        
        //remove-dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }


            int result =arr[front];
           front = (front+1)%size;
           //delete last element
           if(rear == front ){
            rear =front = -1;
           }else{
                front =(front+1)%size;
           }
            return result;
        }

         //peek
         public int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
       

    }
    public static void main(String args[]){
         CQueue q = new CQueue(3);
       q.add(1);
       q.add(2);
       q.add(3);
    //    System.out.println(q.remove());
    //    q.add(4);
    //    System.out.println(q.remove());
    //    q.add(5);

       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }

    }
}

