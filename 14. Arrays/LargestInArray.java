

public class LargestInArray {
    public static void main(String args[]){
        int arr[]={3,2,4,9,0,10,34,24};
      
        int maxnumber = largestInArray(arr);
        System.out.println("Largest element in the array is: "+maxnumber);
    }
    public static int largestInArray(int arr[]){
        //int largest =Integer.MIN_VALUE;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
               
            }
            
        }
       return max;
    }
}
