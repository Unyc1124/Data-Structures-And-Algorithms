import java.util.*;

public class binoco{
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the value of n: ");
     int n = sc.nextInt();
     System.out.println("Enter the value of r: ");
     int r = sc.nextInt();
     calcbinoc(n, r);
     sc.close();
     
    }
   public static int calcf(int a){
        int f=1;
        for(int i=1;i<=a;i++){
           f=f*i;
            }
            return f;
        }
        
     public static int calcbinoc(int n ,int r){
        int n_fact = calcf(n);
        int r_fact = calcf(r);
        int n_minus_r = calcf(n-r);
        int coeff = n_fact/(r_fact*n_minus_r); 
        System.out.println("bino-coeff is : "+coeff);
        return coeff; 
    } 
   
    }
