    public class QUMin {
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
            tree[sti] = Math.min(tree[2*sti+1],tree[2*sti+2]);
            return tree[sti];//sti=>i bhi le skte h
        }

        //Query min
        public static int getmin(int arr[],int qi,int qj){
            int n = arr.length;
            return getminUtil(0,0,n-1,qi,qj);
        }

        public static int getminUtil(int i,int si,int sj,int qi,int qj){
            if(si > qj || sj < qi){ //no overlap
                return Integer.MAX_VALUE;
            }else if(si >= qi && sj <= qj){//complete overlap
                return tree[i];
            }else{//partial overlap
                int mid = (si +sj)/2;
                int leftAns = getminUtil(2*i+1, si, mid, qi, qj);
                int rightAns = getminUtil(2*i+2, mid+1, sj, qi, qj);
                return Math.min(leftAns,rightAns);
            }
        }

        //Update min
        public static void update(int arr[],int idx,int newVal){
            arr[idx]=newVal;
            int n=arr.length;
            updateUtil(0,0,n-1,idx,newVal);

        }
        public static void updateUtil(int i,int si,int sj,int idx,int newVal){
            if( idx > sj || idx <si ){ //no overlap
                return;
            }
            // overlap
            if( si == sj){//this for si=sj yani for ex (2,2)
                tree[i]=newVal;
            }
            if( si!= sj){
                tree[i] = Math.min(tree[i],newVal);
                int mid = (si+sj)/2;
                updateUtil(2*i+1,si,mid,idx,newVal);//left
                updateUtil(2*i+2,mid+1,sj,idx,newVal);//right
            }
        }


        public static void main(String args[]){
            int arr[]={6,8,-1,2,17,1,3,2,4};
            int n=arr.length;
            init(n);
            buildST(arr, 0, n-1, 0);
            // for(int i=0;i<tree.length;i++){
            //     System.out.print(tree[i]+" ");
            // }
            System.out.println(getmin(arr,2,5));

            update(arr,2,20);
            System.out.println(getmin(arr,2,5));
        }







    }
