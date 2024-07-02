

public class RodCutting {
    public static void main(String args[]){
        int len[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int rodlen=8;

        System.out.println(rodCutting(len, price, rodlen));
    }

    public static int rodCutting(int len[],int price[],int rodlen){
        int n= len.length;
        int dp[][]=new int[n+1][rodlen+1];

        for(int i=0;i<n+1;i++){//initialisation
          for(int j=0;j<rodlen+1;j++){
            if(i==0||j==0){
                dp[i][j] = 0;
            }
          }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodlen+1;j++){
                if(len[i-1]<=j){//valid
                    dp[i][j]=Math.max(price[i-1] + dp[i][j-len[i-1]],dp[i-1][j]);
                }else{//invalid-exclude
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][rodlen];
  
    }
}
