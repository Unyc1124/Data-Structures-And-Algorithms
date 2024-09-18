public class Spiral {//Spiral Matrix => Google,microsoft,adobe,etc
    public static void main(String args[]){
        printSpiral(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int endRow=matrix.length-1;
        int startCol = 0;   
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<endCol;j++){//column changing
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int j=startRow;j<endRow;j++){//row changing
               
                System.out.print(matrix[j][endCol]+" ");
            }

            //bottom
            for(int j=endCol;j>=startCol;j--){//column changing
                if(startCol == endCol){
                   break;//kyuki ye shyad top me pehle hi hogyahoga toh dobara print nhi ho 
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left  
            for(int j=endRow;j>=startRow;j--){//row changing 
                if(startRow == endRow){
                    return;//kyuki ye shyad top me pehle hi hogya hoga toh dobara print nhi ho
                }
                System.out.print(matrix[j][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++; 
            endCol--;
        }
    }
    
}
