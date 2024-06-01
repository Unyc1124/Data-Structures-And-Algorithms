//find if any pair in "sorted and rotated" arraylist has a target sum.

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        pairSum(list,target);
    }
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int pivotidx = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                //breaking point
                pivotidx =1;
                break;
            }
        }
        int n =list.size();
        int lp = pivotidx+1;//smallest
        int rp = pivotidx ;//largest
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)< target){
                lp = (lp+1)%n;
            }
            else{//case 3
                rp = (n+rp-1)%n;
            }
        }
        
        
        return false;
    }
}
