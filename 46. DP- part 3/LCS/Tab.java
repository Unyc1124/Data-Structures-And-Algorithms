public class Tab {
    public static void main(String args[]){
        String str1 = "abcdge";
        String str2 ="abedg";
        System.out.println(lcs(str1, str2));
    }

    public static int lcs(String str1,String str2){
        int n = str1.length();
        int m =  str2.length();
    
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i ==0 || j==0){
                    dp[i][j]=0;//java me ye compulosry nhi h just for understanfing initialise
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j]= 1 + dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    return dp[n][m];
  }
    
}//O(n*m)
