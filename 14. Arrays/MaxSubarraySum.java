public class MaxSubarraySum {
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        kadane(arr);
    }
    //Brute force
    public static void maxSum_Subarray(int arr[]){
       int currsum =0;
       int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum = 0;//evertime before new loop of k currSum ko zero krdo.
               // int start =i,end=j;
                for(int k=i;k<=j;k++){
                   currsum += arr[k];
                }
                System.out.println(currsum);
                if(maxSum < currsum){
                    maxSum = currsum;
                } }
           
        }
        System.out.println("Max Sum is: "+ maxSum);
      
    }
    //PrefixSum-Formula prefix[end]-(prefix[start-1]) & prefix[i-1]+arr[i]//o(n2)
    public static void Maxsum_Subarray2(int arr[]){
        int currsum =0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
      
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;
              
                   currsum = start == 0 ? prefix[end] : prefix[end] - (prefix[start-1]);

                if(maxSum < currsum){
                    maxSum = currsum;
                } }
           
        }
        System.out.println("Max Sum is: "+ maxSum);
      
    }
    //kadanes algorithm
    public static void kadane(int arr[]){
        int currSum =0;
        int maxSum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum <0){
                currSum =0;
            }
            maxSum =Math.max(currSum,maxSum);
                }
                System.out.println("Max Sum : "+maxSum);
            }
        }
   
//try for all negative numbers given array -1,-2,-3,-4