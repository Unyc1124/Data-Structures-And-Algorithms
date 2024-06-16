public class WordBreak {//O(n)-linear time
   
        static class Node{
            Node children[]=new Node[26];
            boolean eow=false;
         
    
            Node(){
                for(int i=0;i<26;i++){
                    children[i]=null;
            }
        }
    }
    
    public static void insert(String words){//level-order traversal
        Node curr = root;
        for(int i=0;i<words.length();i++){
            int index = words.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }
    
    public static boolean search(String key){//level-order traversal
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow == true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        //substring (beginidx,last idx-exclusive idx)
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i)))
          return true;
        }
        return false;
    }
        public static Node root = new Node();
        public static void main(String args[]){
            String words[]={"i","like","sam","samsung","mobile","ice"};
            String key = "ilikesamsung";
            for(int i=0;i<words.length;i++){
                insert(words[i]);
            }
            System.out.println(wordBreak(key));
        }
    
    
}
