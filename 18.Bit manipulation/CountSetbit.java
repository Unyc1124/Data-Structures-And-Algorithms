//count set bit -google microsoft imp
//set bit - means number of 1
public class CountSetbit {

    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){//check our lsb
                count++;
            }
           n= n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countSetBit(10));
    }
}
