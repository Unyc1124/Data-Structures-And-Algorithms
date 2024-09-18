import java.util.Scanner;

public class Largest3 {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println("Largest number is: "+a);
        }else if(b>=c){
            System.out.println("Largest number is: "+b);
        }else{
            System.out.println("Largest number is: "+c);
        }
        sc.close();
    }
}
