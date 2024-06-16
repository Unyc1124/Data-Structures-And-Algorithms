public class DisjointSetUnion{//constant - O(4k)-imp in graphs very optimized ds 

    static int n=7;
    static int par[] =  new int[n];
    static int rank[] = new int[n];

     //initialise
     public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
           
        }
    }


    //find fxn
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x]=find(par[x]);//update karte jao so that barbar nhi krna pade call
    }

    //union fxn
    public static void union(int a,int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA]== rank[parB]){//cycle condn
            par[parB]=parA;
            rank[parA]++;//kisi ko bhi parent bna skte ho
        }else if(rank[parA] < rank[parB]){
            par[parA]=parB;
        }else{
            par[parB]=parA;
        }
    }
    public static void main(String args[]){
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);

    }

     
   
}