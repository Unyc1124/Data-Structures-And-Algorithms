import java.util.*;

public class ValidParentheses {
    public static void main(String args[]){
        String str ="{[(<)]}";
        System.out.println(checkValidP(str));//O(n)
    }
    public static boolean checkValidP(String str){
        Stack<Character> stack =new Stack<>();
        //fxn step 1
        for(int i = 0 ;i<str.length();i++){
            char ch= str.charAt(i);
            //check karo opening wali condition
            if(ch == '(' ||ch =='{'|| ch == '['){
                stack.push(ch);
            }else{
                //closing-sabse pehle check khali toh nhi h stack
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek()=='(' && ch ==')') || (stack.peek()=='{' && ch =='}')||  (stack.peek()=='[' && ch ==']')){
                    stack.pop();
                }else{
                    return false;
                }

            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
