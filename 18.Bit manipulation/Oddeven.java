//Question-1 : check if a number is odd or even


public class Oddeven{

    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        int n = 5;
        OddOrEven(n);
    }
}