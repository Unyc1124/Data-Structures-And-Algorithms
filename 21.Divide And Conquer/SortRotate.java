public class SortRotate {//Sorted and rotated Array-modified binary search
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int target = 0;
        search(arr,target,0,arr.length-1);
    }

    public static int search(int arr[],int tar,int si,int ei){
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2;

        //case found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr,tar,si,mid-1);
            }else{
                //case b: right
                 return search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else{
            //case c:left
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else{
                //case d:right
                return search(arr,tar,si,mid-1);
            }
        }
    }
}
