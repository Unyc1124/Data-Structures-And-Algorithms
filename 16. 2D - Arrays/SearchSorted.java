public class SearchSorted {
    public static void main(String args[]){
        
        int key=300;
        searchSorted(new int[][]{{10,20,20,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}},key);
    }

    public static boolean searchSorted(int arr[][],int key){//staircase search
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] ==key){
                System.out.println("found key at("+row+","+col+")");
                return true;
            }
            else if(key < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
        
    }
}
