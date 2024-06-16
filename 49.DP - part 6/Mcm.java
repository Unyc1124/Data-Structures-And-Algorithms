import java.util.*;

public class Mcm{

    //Recursion fxn
    public static int mcm(int arr[],int i,int j){
        if(i == j){
            return 0;//single matrix case bc
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k);//Ai....Ak => arr[i-1]*arr[k]
            int cost2 = mcm(arr, k+1, j);//Ai+1....Aj => arr[k]*arr[j]
            int cost3 = arr[i-1]* arr[k]*arr[j];
            int finalcost = cost1+cost2+cost3;
            ans = Math.min(ans,finalcost);
        }
        return ans;//mincost
    }

    //Memoization fxn
    public static int mcm2(int arr[],int i,int j,int dp[][]){
        if( i==j ){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcm2(arr,i,k,dp);//Ai....Ak => arr[i-1]*arr[k]
            int cost2 = mcm2(arr, k+1, j,dp);//Ai+1....Aj => arr[k]*arr[j]
            int cost3 = arr[i-1]* arr[k]*arr[j];
            int finalcost = cost1+cost2+cost3;
            ans = Math.min(ans,finalcost);
        }       
        return dp[i][j] = ans;
     }

     //Tabulation function
     public static int mcmtab(int arr[]){
        int n=arr.length;
        int dp[][]=new int[n][n];

        //initialisation
        for(int i=0;i<n;i++){
                dp[i][i] = 0;
            }

            //bottom up
            for(int len=2;len<=n-1;len++){
                for(int i=1;i<=n-len;i++){
                    int j=i+len-1;
                    dp[i][j]=Integer.MAX_VALUE;

                    for(int k=i;k<=j-1;k++){
                      int  cost1 = dp[i][k];//Ai....Ak => arr[i-1]*arr[k
                        int cost2 = dp[k+1][j];//Ai+1....Aj => arr[k]*arr[j]
                        int cost3 = arr[i-1]* arr[k]*arr[j];
                        dp[i][j]=Math.min(dp[i][j],cost1+cost2+cost3);
                    }
                    

                }
            }
            print(dp);
            return dp[1][n-1];//
        }

        public static void print(int dp[][]){
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

     
    
    public static void main(String[] args){
        int arr[] ={1,2,3,4,3};
        int n=arr.length;
        // System.out.println(mcm(arr,1,n-1));//rec

        // int dp[][]=new int[n][n];
        // for(int i=0;i<n;i++){//initialisation
        //    Arrays.fill(dp[i],-1);
        // }
        // System.out.println(mcm2(arr,1,n-1,dp));//mem => O(n^2)

        System.out.println(mcmtab(arr));//tab
       
    }
}