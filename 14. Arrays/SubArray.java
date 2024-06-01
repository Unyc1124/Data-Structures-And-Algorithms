public class SubArray {
    public static void main(String args[]){
        int arr[]={3,12,16,18,20};
        print_Subarray(arr);
    }
    public static void print_Subarray(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
               // int start =i,end=j;
                for(int k=i;k<=j;k++){//concept is pehle element pakdo last element pakdo bich ke sare elements ko print krado
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays: "+ts);
    }
}
