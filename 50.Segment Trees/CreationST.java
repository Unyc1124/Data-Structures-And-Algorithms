

public class CreationST{

    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static int buildST(int arr[],int start,int end,int sti){
        if(start==end){
            tree[sti]=arr[start];
            return arr[start];
        }

        int mid = (start+end)/2;
        buildST(arr, start, mid, 2*sti+1);//build left subtree
        buildST(arr, mid+1,end, 2*sti+2);//build right subtree
        tree[sti] = tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];//sti=>i bhi le skte h
    }

    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildST(arr, 0, n-1, 0);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }

        
    }
}