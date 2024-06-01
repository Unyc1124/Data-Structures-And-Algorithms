public class Assignment {
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};
        //System.out.println(question11(arr));
        triplet(arr);
    }
    //question 1
    public static boolean question1(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //question 1 using while loop
    public static boolean question11(int arr[]){
        int i=0;
        while (i<arr.length){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                    
                }
            }
            i++;
        }
        return false;
    }
    //question 5
    public static void triplet(int arr[]){
        for(int i=0;i<arr.length;i++){
          //  int curr =arr[i];
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k] && (arr[i]+arr[j]+arr[k])==0)
                    System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+")");
                }
                
            }
            System.out.println();
        }
    }

}
