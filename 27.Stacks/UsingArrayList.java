//implementation of stack using ArrayLists
import java.util.ArrayList;

public class UsingArrayList{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
       
        public boolean isEmpty(){
           return list.size() == 0;
        }
        //push fxn
        public void push(int data){
            list.add(data);
        }
        //pop fxn
        public int pop(){
            //corner case- khali stack
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek fxn
        public int peek(){
            //corner case -khali stack 
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
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
}
