import java.util.Scanner;

public class Ter {//Ternary opeartor
    public static void main(String args[]){
        int marks;
        Scanner sc =new Scanner(System.in);
        marks = sc.nextInt();
        String result = (marks>=24) ? "Pass":"Fail";
        System.out.println(result);
        sc.close();
    }
}
// Synatx:variable = (condition)? value1(sahi hua toh):value2(galat hua toh)
//ex: 1. boolean large = (5>3) ? 5:3;
//    2. String type = (5%2)==0 ? "Even":"Odd";
