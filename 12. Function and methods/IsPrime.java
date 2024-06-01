public class IsPrime {
    public static void main(String args[]){
        primeInRange(100);
        System.out.println(isPrime(4));
        System.out.println(optimizedIsPrime(4));
    }
    public static boolean isPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }

        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
                }
            break;
        }
        return true;
    }
    public static boolean optimizedIsPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
                }
            break;
    }
    return true;
}
//prime in range 
public static void  primeInRange(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
    }
    System.out.println();

}
}
