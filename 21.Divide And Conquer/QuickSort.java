public class QuickSort {
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei){//base case
            return;
        }
      
        int pidx = partition(arr,si,ei);  //pivot ka idx

        quickSort(arr, si, pidx-1);//left
        quickSort(arr, pidx+1, ei);//right


    }

    public static int partition(int arr[],int si,int ei){

         //pivot -last element
         int pivot = arr[ei];
         int i =  si-1;//to make place for els smaller than pivot
         for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap 
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
         }
         i++;
        //swap 
        int temp = pivot;
        arr[ei]=arr[i];//pivot = arr[i] this is wrong kyuki variable nhi array me idx ke jagah change krna h 
        arr[i]=temp;
        return i;
}

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
