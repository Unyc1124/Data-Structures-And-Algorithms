import java.util.*;

public class CatalanMem {

    public static void main(String args[]){
        int n=30;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalanMem(n,dp));
    }
    public  static int catalanMem(int n,int dp[]){
     
        if(n==0||n==1){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans +=catalanMem(i,dp)*catalanMem(n-1-i,dp);
        }
        return dp[n]=ans;
    }
}
