public class Tiling {
    public static void main(String args[]){
        System.out.println(tiling(3));
    }

    public static int tiling(int n){// 2 X n(floor size)
        if(n==0||n==1){
            return 1;
        }

        //kaam
        //vertical choice
        int verticalTiles=tiling(n-1);//f(n-1)
        //horizontal choice
        int horizontalTiles=tiling(n-2);//f(n-2)
        return verticalTiles+horizontalTiles;
    }
}//variation can be 4 x 1 something like this 
