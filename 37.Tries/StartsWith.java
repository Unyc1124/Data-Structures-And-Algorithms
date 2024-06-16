public class StartsWith {
  
    
   
        static class Node{
            Node children[]=new Node[26];
            boolean eow=false;
            int freq;
    
            Node(){
                for(int i=0;i<26;i++){
                    children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root =new Node();
    
    public static void insert(String words){//level-order traversal
        Node curr = root;
        for(int i=0;i<words.length();i++){
            int index = words.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index] = new Node();
            }else{
                curr.children[index].freq++;
            }
         curr=   curr.children[index];
        }
        curr.eow = true;
    }

    
    public static boolean search(String words){//level-order traversal
        Node curr = root;
        for(int i=0;i<words.length();i++){
            int index = words.charAt(i)-'a';
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
        

    public static void findPrefix(Node root,String ans){
        if(root == null){
            return ;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i] != null){
                findPrefix(root.children[i],ans+(char)(i+'a'));
            }
        }
    }
        public static void main(String args[]){
            String words[]={"zebra","dog","duck","dove"};
          
            for(int i=0;i<words.length;i++){
                insert(words[i]);
            }
            root.freq=-1;
           findPrefix(root, "");//O(L)longest words
        }
    
    


}


