import java.util.*;
public class Implementation{

    static class HashMap<K,V>{//K,V are generics like when data type can be anything int,boolean,ex.

        private class Node{
            K key;
            V value;
            
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;//linked list size
        private int N;
        private LinkedList<Node> buckets[];//size N array of ll
        
        @SuppressWarnings("unchecked")
        public HashMap(){
          
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();//initialize khali linked list se
            }
        }

        private int hashFunction(K key){
            //hashcode function
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }

        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di =0;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;

        }
        public void put(K key,V value){//O(lambda)-> O(1)
            int bi = hashFunction(key);//0-(size-1)
            int di = SearchInLL(key,bi);//actual linkedlist ka index-valid Or -1?

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

             //rehashing ka time aaya h ya nhi
            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

           
            //rehashing ka time aaya h ya nhi
        @SuppressWarnings("unchecked")
            private void rehash(){
             LinkedList<Node> oldBuck[]=buckets ;
             buckets=new LinkedList[N*2];
             N=2*N;
             for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
             }
             //Nodes -> add in bucket
             for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll =oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node =ll.remove();
                    put(node.key,node.value);
                }
             }
         }

            public boolean containsKey(K key){
                int bi = hashFunction(key);//0-(size-1)
                int di = SearchInLL(key,bi);//actual linkedlist ka index-valid Or -1?
    
                if(di != -1){//return true for valid
                    return true;
                }else{
                    return false;
                }
            }
    
        
            public V remove(K key){
                int bi = hashFunction(key);//0-(size-1)
                int di = SearchInLL(key,bi);//actual linkedlist ka index-valid Or -1?
    
                if(di != -1){
                    Node node = buckets[bi].get(di);
                    n--;
                    return node.value;
                }else{
                   return null;
                }
            }

            public V get(K key){
                int bi = hashFunction(key);//0-(size-1)
                int di = SearchInLL(key,bi);//actual linkedlist ka index-valid Or -1?
    
                if(di != -1){
                    Node node = buckets[bi].get(di);
                    return node.value ;
                }else{
                   return null;
                }
            }
    
            public ArrayList<K> keySet(){
                ArrayList<K> keys = new ArrayList<>();
                for(int i=0;i<buckets.length;i++){
                    LinkedList<Node> ll=buckets[i];
                    for(Node node : ll){
                        keys.add(node.key);
                    }
                }
                return keys;
            }

            public boolean isEmpty(){
                return n==0;
            }
           
        }

        public static void main(String args[]){
            HashMap<String,Integer> map = new HashMap<>();
            map.put("a",1);
            map.put("b",2);
           

            ArrayList<String> keys = map.keySet();
            for(String key : keys){
                System.out.println(key);
            }

            System.out.println(map.remove("a"));

            
        }



    } 

        

        
       
       
 
           
            
           
 

