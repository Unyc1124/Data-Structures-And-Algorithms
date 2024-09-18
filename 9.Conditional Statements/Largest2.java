import java.util.*;
public class Largest2 {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>=b)
            System.out.println("Largest number is: "+a);
        else
            System.out.println("Largest number is: "+b);
        
        sc.close();
    }
}
