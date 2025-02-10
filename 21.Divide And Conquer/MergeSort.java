public class MergeSort{//O(nlogn)

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
      mergeSort(arr, 0, arr.length-1);
      printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right

        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si,int mid,int ei){

        int temp[] = new int[ei-si+1];

        int i=si;//itr for left 
        int j=mid+1;//itr for right
        int k=0;//itr for temp arr


        // yaha basically jo bhi chota h wo store hojayega temp array 
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{  
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
//copy remaining elements
        while(i <= mid){
            temp[k++]=arr[i++];
        }
        while(j <= ei){
            temp[k++]=arr[j++];
            
        }
        //copy temp to original
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}