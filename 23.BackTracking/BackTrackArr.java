//backtracking in arrays

public class BackTrackArr {
    public static void changeArr(int arr[],int i ,int val){
        //base case
        if(i== arr.length){
            printArr(arr);
            return;
        }
        //recursion(kaam)
        arr[i]=val;
        changeArr(arr,i+1,val+1);//fxn call step
        arr[i]=arr[i]-2;//call ke baad ka step-backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= new int[5];

        changeArr(arr,0,1);
        printArr(arr);

    }
}
