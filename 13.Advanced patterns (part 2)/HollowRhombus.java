    import java.util.Scanner;

    public class HollowRhombus {
                public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of lines: ");
                int n = sc.nextInt();
                sc.close();
                pattern(n);
                }
            public static void pattern(int n){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                    }
                    for(int j=1;j<=n;j++){
                        if(i==1||j==1||i==n||j==n){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                       
                     }
                     System.out.println();
            }
        }
    }
