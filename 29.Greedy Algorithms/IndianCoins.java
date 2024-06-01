import java.util.*;

public class IndianCoins {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};//Inetegr class lia humne kyuki reverse order krna h 
        //descending order

        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins =0;
        int amount =1056;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total (min) coins used  : "+countOfCoins);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }
        System.out.println();
  }
}
