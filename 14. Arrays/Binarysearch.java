import java.util.Scanner;
//needs sorted array
public class Binarysearch {
    public static void main(String args[]){
        int arr[]={3,12,16,18,20};
        System.out.println("Enter the key value: ");
        Scanner sc = new Scanner(System.in);
        int key =sc.nextInt();
        sc.close();
        int index = bin_search(arr, key);
        System.out.println(index+1);
    }
    public static int bin_search(int arr[],int key){
        int start =0 , end = arr.length;
        while(start<=end){
            int mid =(start+end)/2;
            //comparisons
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
