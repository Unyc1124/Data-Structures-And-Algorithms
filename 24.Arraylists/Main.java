import java.util.*;

public class Main {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(0);
        list.add(5);
        
        System.out.println(list);

        //sorting - ascemding 
        
        Collections.sort(list);

        //sorting -descending

        Collections.sort(list,Collections.reverseOrder());

        System.out.println("Sorted list"+ list);
        int idx1=1,idx=3;
        //finding max in list
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(max < list.get(i)){
                max = list.get(i);
            }// or max = Math.max(max,list.get(i))
        }
        System.out.println(max);
        swap(list, idx1, idx);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp =list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

}
