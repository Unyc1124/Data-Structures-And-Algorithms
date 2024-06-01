import java.util.*;

public class NextGtr {
    public static void main(String args[]){
        int arr[]={ 6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGtr[]= new int[arr.length];
        
        //process fxn

        for(int i=arr.length-1;i>=0;i--){
            //1 while loop to check koi element chota to nhi h agr chota hua toh pop krdenge 
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            //2 if else-if stack is pura empty wale case check
            if(s.isEmpty()){
                nextGtr[i]= -1;
            }else{
                nextGtr[i] = arr[s.peek()];
            }

            //3 push in s
            s.push(i);//yaha hum idx ko push kr denge 
        }
        for(int i =0;i<nextGtr.length;i++){
            System.out.print(nextGtr[i]+" ");
        }
        System.out.println();
    }
}
//next gtr right
//next gtr left-loop ko forwrd krdo 
//next smallest right- arr[s.peek()] "<=" arr[i] -> change this condn to  ">="
//next smallest left- change loop and condn both --> loop ko forwrd krdo  and change this condn to  ">="
 