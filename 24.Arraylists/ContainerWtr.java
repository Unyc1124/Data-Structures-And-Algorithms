import java.util.*;
public class ContainerWtr {
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(pointercWtr(height));
        
    }
    //brute force
    public static int containerWtr(ArrayList<Integer> height){
        int maxwtr =0;
        for(int i=0;i<height.size();i++){
            for(int j =i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int  width =j-i;
                int currWtr = ht*width;
                maxwtr= Math.max(maxwtr,currWtr);
            }
        }
        return maxwtr;
    }
    //two pointer apprach O(n)
    public static int pointercWtr(ArrayList<Integer> height){
        int maxWtr=0;
        int lp =0;
        int rp=height.size()-1;
        while(lp<rp){//calc wtr
            int ht = Math.min(height.get(lp),height.get(rp));
            int  width =rp-lp;
            int currWtr = ht*width;
            maxWtr= Math.max(maxWtr,currWtr);
            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWtr;
    }
}
