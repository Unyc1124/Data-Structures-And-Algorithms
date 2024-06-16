public class Rec{

    public static void main(String args[]){
        String str1 = "abcdge";
        String str2 ="abedg";
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));
    }

    public static int lcs(String str1,String str2,int n,int m){
        if(n == 0 || m == 0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){//same
            return 1 + lcs(str1,str2,n-1,m-1);
        }else{//different
            return Math.max(lcs(str1,str2,n-1,m),lcs(str1,str2,n,m-1));
        }
    }
}