public class PairArray {
    public static void main(String args[]){
        int arr[]={3,12,16,18,20};
        pair_array(arr);
    }
    public static void pair_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr =arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
