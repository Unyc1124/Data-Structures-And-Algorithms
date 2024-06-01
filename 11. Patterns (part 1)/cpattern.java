import java.util.*;

public class cpattern{
    public static void main(String[] args){
        System.out.print("enter the value of n: ");
        char ch='A';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("---Pattern---");
       for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
    }
   