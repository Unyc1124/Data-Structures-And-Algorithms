public class Ft {
    public static void main(String args[]){
        int n=4;
        
        System.out.println(fibT(n));
    }

    public static int fibT(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];//ans
    }

  
}
