import java.util.*;
public class MaxareaHistogram {//O(n)
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};//heights of histogram
        maxArea(arr);
    }
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                //-1
                nsr[i]= arr.length;
            }else{
                //top
                nsr[i]=stack.peek();
            }
            stack.push(i);
        }
        //Next smaller left
      stack = new Stack<>();

      for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            //-1
            nsl[i]= -1;
        }else{
            //top
            nsl[i]=stack.peek();
        }
        stack.push(i);
    }
    //current area : width =j-i-1 = nsr[i]-nsl[i]-1
    for(int i=0;i<arr.length;i++){
        int height= arr[i];
        int width = nsr[i]-nsl[i]-1;
        int currArea = height * width;
        maxArea = Math.max(currArea, maxArea);
    }
System.out.println("max area in histogram= " + maxArea);
    }
}
