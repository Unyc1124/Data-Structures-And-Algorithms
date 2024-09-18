import java.util.*;
public class Switch{//calculator
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char opr = sc.next().charAt(0);
        switch(opr){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("Invalid operator");
            break;
        }
        sc.close();
    }
}
//syntax:
/* switch(expression){
    case 1:
        statement1;
        break;
    case 2:
        statement2;
        break;
    default:
        statement3;
        break;
 */ 
