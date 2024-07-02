public class LF {//last & first occurences
    public static void main(String[] args) {
        int arr[]={8,3,9,5,10,2,5,3};
        System.out.println(firstOccur(arr, 0, 5));
        System.out.println(lastOccur(arr, 0, 5));
    }

    //first occurence
    public static int firstOccur(int arr[],int i,int key){//O(n)

        if(i ==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return  firstOccur(arr, i+1, key);
    }

    //last occurence
    public static int lastOccur(int arr[],int i,int key){
        if(i ==arr.length){
            return -1;
        }
       int isFound=lastOccur(arr, i+1, key);
       if(isFound ==-1 && arr[i]==key){
           return i;
       }
       return isFound;
  }
}
