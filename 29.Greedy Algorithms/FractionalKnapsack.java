import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]){
        int val[]={60,100,120};
        int wt[]={10,20,30};
        int capacity =50;

        double ratio[][]=new double[val.length][2];
        //0th col => idx;1st col => items ki ratio(val/wt or price pr unit)
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;//index store kr lia
            ratio[i][1]=val[i]/(double)wt[i];//ratio store kr lia

        }
        //ascending order sorting h
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));//ratio ke anusar sort kr do

        int remainingcapacity = capacity;
        int finalAns =0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(remainingcapacity >= wt[idx]){
                finalAns += val[idx];
                remainingcapacity-= wt[idx];
            }else{
                //including fractional item pura nahi
                finalAns += ratio[i][1]* remainingcapacity;
                remainingcapacity =0;
                break;
            }
        }
        System.out.println("Final kpsack ans : "+finalAns);
    }
}
