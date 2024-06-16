public class Mem {
   
        public static void main(String args[]){
            String str1 = "abcdge";
            String str2 ="abedg";
            int[][] dp = new int[ str1.length()+1][ str2.length()+1];
            for(int i=0;i< str1.length()+1;i++){
                for(int j=0;j< str2.length()+1;j++){
                    dp[i][j] = -1;//initialization
                }
            }
            System.out.println(lcs(str1, str2, str1.length(), str2.length(),dp));
        }
    
        public static int lcs(String str1,String str2,int n,int m,int [][]dp){
            if(n == 0 || m == 0){
                return 0;
            }
    
            if(dp[n][m] != -1){
                return dp[n][m];
            }
            if(str1.charAt(n-1) == str2.charAt(m-1)){//same
                return dp[n][m]= 1 + lcs(str1,str2,n-1,m-1,dp);
            }else{//different
                return  dp[n][m]=Math.max(lcs(str1,str2,n-1,m,dp),lcs(str1,str2,n,m-1,dp));
            }
        }
    
}
