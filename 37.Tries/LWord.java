public class LWord {
//not getting correct output
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word flag

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    public static String ans = "";

    public static void insert(String word) { // level-order traversal
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i=0;i<26;i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+97);
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // backtrack
            }
        }
    }

    public static void main(String args[]) {
        String words[] = {"app", "banana", "appl", "apply", "apple","a"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.print(ans); 
    }
    }
       

