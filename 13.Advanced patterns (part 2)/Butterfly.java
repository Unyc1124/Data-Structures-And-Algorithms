import java.util.Scanner;

public class Butterfly {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of lines: ");
         int n = sc.nextInt();
         sc.close();
         pattern(n);
     }
     public static void pattern(int n){
        //1st half
       for(int i=1;i<=n-1;i++){  
         for(int j = 1;j<=i;j++){
            System.out.print("*");
         }  
         for(int k=1;k<=2*(n-i);k++){
            System.out.print(" ");
         }
         
         for(int m = 1;m<=i;m++){
            System.out.print("*");
         } 
         System.out.println();
        }
         //2nd half
     for(int i=n;i>=1;i--){  
        for(int j = 1;j<=i;j++){
           System.out.print("*");
        }  
        for(int k=1;k<=2*(n-i);k++){
           System.out.print(" ");
        }
        
        for(int m = 1;m<=i;m++){
           System.out.print("*");
        } 
        System.out.println();
    }
}
}
