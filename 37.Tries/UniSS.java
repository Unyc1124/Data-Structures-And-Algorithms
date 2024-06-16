
public class UniSS {
 
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

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }
        public static Node root = new Node();
        public static void main(String args[]){
            String str = "ababa";

            //step 1 : suffix -> insert in trie
            for(int i=0;i<str.length();i++){
               String suffix = str.substring(i);
               insert(suffix);
            }
          System.out.println(countNodes(root));
        }
    
    
}
