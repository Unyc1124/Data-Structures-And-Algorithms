//Find and print all subsets ofa given string
//total number of subset is 2^n
public class SubSets {
    public static void findSubset(String str,String ans,int i){
        //base case
        if(i== str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes choice
        findSubset(str,ans+str.charAt(i),i+1);
        //no choice
        findSubset(str,ans,i+1);
        
    }
    public static void main(String args[]){
        String str = "aditi";
        findSubset(str,"",0);

    }
}
//time complexity 0(n*2^n)
//space complexity 0(n)
//try solving this question using string builder for ans