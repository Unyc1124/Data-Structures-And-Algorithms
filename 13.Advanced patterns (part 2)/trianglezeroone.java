import java.util.*;
public class trianglezeroone {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of lines: ");
            int n = sc.nextInt();
            sc.close();
            pattern(n);
   
       }
       public static void pattern(int n){
            for(int i=1;i<=n-1;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                    
              }
              System.out.println(); 
        }
    }
}
       
    

