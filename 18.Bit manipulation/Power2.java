//check if no is a power of 2 or not

public class Power2 {

    public static boolean isPower(int n){
        return (n &(n-1))== 0;
    }
    public static void main(String args[]){
        System.out.println(isPower(15));
    }
}
