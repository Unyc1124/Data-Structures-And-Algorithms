public class DiagonalSum {
    public static void main(String args[]){
        System.out.println(diagonalSum(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));
    }

    public static int diagonalSum(int arr[][]){
        int sum = 0 ;

        //brute force
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             //primary diagonal
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j==arr.length-1){
        //             //secondary diagonal
        //             sum+=arr[i][j];
        //         }
        //     }
        // }

        //optimised approach
        for(int i=0;i<arr.length;i++){
        //pd
        sum += arr[i][i];
        //sd
        sum += arr[i][arr.length-1-i];
       
        }
        return sum;
       



    }
}
