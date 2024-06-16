public class FindPermutations {
    public static void main(String args[]){
        String str = "abc";
    findPermutations(str,"");
    }
    public static void findPermutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion-tc=0(n*n!)
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" => "ab"+"de"="abde"
            String Newstr = str.substring(0,i)+str.substring(i+1);
            findPermutations(Newstr,ans+curr);
        }
    }
}
