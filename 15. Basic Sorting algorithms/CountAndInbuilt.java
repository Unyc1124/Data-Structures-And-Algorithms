import java.util.*;

public class CountAndInbuilt {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
               arr[j] = i;
               j++;
               count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        Integer arr1[]={5,4,1,3,2};//for inbuilt sort becuase reverseOrder fxn ko use krne ke liye object lgta
        Arrays.sort(arr1,0,arr.length);//inbuilt sort

        countingSort(arr);
        printArr(arr);
    }
}
//Inbuilt sort => Arrays.sort(arr,si,ei): Time complexity-> O(nlogn)
//si=> starting index, ei=>ending index

//other methods =>
//Arrays.sort(arr,Collections.reverseOrder())
//Arrays.sort(arr,si,ei,Collections.reverseOrder())
