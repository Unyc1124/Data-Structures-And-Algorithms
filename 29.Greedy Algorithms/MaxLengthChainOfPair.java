import java.util.*;


public class MaxLengthChainOfPair {
   public static void main(String args[]){//nlogn
    int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

    Arrays.sort(pairs,Comparator.comparingDouble(o-> o[1]));
  
   int chainLen =1;
   int b = pairs[0][1];//last selected pair end

   for(int i=1;i<pairs.length;i++){
    if(pairs[i][0] > b){
        chainLen++;
        b= pairs[i][1];

    }

   }
   System.out.println("Max length of chain is: "+chainLen);
}
}
