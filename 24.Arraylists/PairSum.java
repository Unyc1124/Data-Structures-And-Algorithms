//find any pair in a "sorted" arraylist has a target sum list=[1,2,3,4,5,6] target=5 //pair sum1 
import java.util.*;

public class PairSum {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target =3;
        System.out.println(ptrPairSum(list,target));
    }
//brute force -O(n2)
    public static boolean pairSum(ArrayList<Integer> list,int target){
    
        for(int i=0;i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
    //optimized approach - sorted array use this given info-2 ptr approach
    public static boolean ptrPairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //this logic came from sorted array ka concept ki rp-- se sum badhega nhi bilkul isiliye lp++
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;

    }
}
