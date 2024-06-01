import java.util.*;
public class MultiArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        ArrayList<Integer> list3 =new ArrayList<>();
        list1.add(1);list2.add(2);list3.add(3);

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist =mainlist.get(i);
            for(int j =0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        
    }
}