import java.util.*;
public class StackDeque {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);

        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static void main(String args[]){
        Stack stack = new Stack();//not jcf wala normal class ka object
        stack.push(1);stack.push(2);stack.push(3);
        System.out.println("Peek : "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
