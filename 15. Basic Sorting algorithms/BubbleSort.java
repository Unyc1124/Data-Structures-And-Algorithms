public class BubbleSort {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
       
    }

    public static void bubbleSort(int arr[]){
        int swaps=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                 }
            }
        }
        System.out.println(swaps);
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
//best case:worst case:O(n^2)
