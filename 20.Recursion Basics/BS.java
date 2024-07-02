public class BS {//Binary Strings problem code
    public static void main(String args[]){
        printbinaryStrings(3, 0," ");
    }

    public static void printbinaryStrings(int n,int lastPlace,String str){

        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        // if(lastPlace == 0){
        //     //making sit 0 on chair n
        //     printbinaryStrings(n-1,0, str.append("0"));
        //   printbinaryStrings(n-1,0, str.append("0"));
        // }else{
        //     printbinaryStrings(n-1,0, str.append("0"));
        // }

        printbinaryStrings(n-1,0, str+"0");
        if( lastPlace == 0){
            printbinaryStrings(n-1,1, str+"1");
        }
    }
}
