    //arrays are always passed by referene
    import java.util.*;
    public class LinearSearch {
    public static void main(String args[]){
        int arr[]={3,2,4,9,0,10,34,24};
        System.out.println("Enter the key value: ");
        Scanner sc = new Scanner(System.in);
        int key =sc.nextInt();
        sc.close();
        int index = linear_search(arr,key);
        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index: "+index);
        }
    }

    public static int linear_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
            return -1;
    }
}
