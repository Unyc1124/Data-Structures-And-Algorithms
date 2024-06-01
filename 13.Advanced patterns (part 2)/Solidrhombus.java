    import java.util.Scanner;

    public class Solidrhombus {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of lines: ");
            int n = sc.nextInt();
            sc.close();
            pattern(n);
        }
        public static void pattern(int n){
            for(int i=1;i<=n-1;i++){
                for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                 }
               System.out.println();
             }
            
        }
    }
