//operations basics
import java.util.*;
public class HashMapOpr {

    public static void main(String args[]){
        // Hashmap=>random order
        HashMap<String,Integer> hm = new HashMap<>();
        //put(key,value)=>O(1)
        hm.put("aditi",1500000);
        hm.put("Omkar", 2000000);
        System.out.println(hm);

        //get(key)=>O(1)
        System.out.println(hm.get("aditi"));

        //ContainsKey=>O(1)
        System.out.println(hm.containsKey("neelam"));

        //remove=>O(1)
        // hm.remove("aditi");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        // hm.clear();
        // System.out.println(hm);
        // System.out.println(hm.isEmpty());

        //Iteration on hashmaps
        Set<String> keys = hm.keySet();
        System.out.println(keys);//kisi bhi random order me print karega (itr+parent type)
        for(String key:keys){//for each loop
            System.out.println(key+" "+hm.get(key));
        }

    }
}
