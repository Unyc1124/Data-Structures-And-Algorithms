public class RevArray {
    public static void main(String args[]){
        int arr[]={3,12,16,18,20};
       rev_array(arr);
       print_array(arr);
    }
    public static void rev_array(int arr[]){
        int low = 0 , high =arr.length-1;
        while(low<high){
             //swapping
          int temp=arr[high];
            arr[high--]=arr[low];
            arr[low++]=temp;
        }
    }
    public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
