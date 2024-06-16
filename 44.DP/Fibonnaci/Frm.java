public class Frm {
    public static void main(String args[]){
        int n=4;
        int f[]=new int[n+1];
        System.out.println(fib(n,f));
    }

    public static int fib(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        //memoization
        if(f[n] !=0){//dp table return 
            return f[n];
        }
        f[n]=fib(n-1,f)+fib(n-2,f);
        return f[n];
    }
}
