

import java.util.*;
public class Basics {
    public static void main(String args[]){
        //ArrayList is a part of java collection frameworks
        //syntax - ArrayList< type of data > name of list //now here type of data can be String | Boolean | Float
        //classname objectname =new classname();//oops wali class se object banaya h arraylist class me ek 
        ArrayList<Integer> list = new ArrayList<>();
        //simple addition
        list.add(1);list.add(2);list.add(3);
        //index  specific addition
        System.out.println(list);
        
        list.add(1,9);
        //normal direct print list
        System.out.println(list);
        System.out.println(list.size());
        //printing using size fxn and get fxn
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println(list);
        //get opr
        System.out.println(list.get(2));
        System.out.println(list.remove(1));
        System.out.println(list);
        list.set(1,10);
        System.out.println(list.contains(23));
        System.out.println(list.contains(10));

        //Size of an arraylist- .size()

        
    }
}
