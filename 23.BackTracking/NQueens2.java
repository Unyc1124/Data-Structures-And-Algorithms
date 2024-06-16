//NQueens print one solution -check if prob can be solved & print only 1 sol

public class NQueens2 {
        static int count =0;
        public static void main(String args[]){
            int n = 4;
            char board[][]=new char[n][n];
            //initialize
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    board[i][j]='x';
                }
            }
           if( nQueens(board,0)){
               System.out.println("sol possible");
               printBoard(board);
           }else{
               System.out.println("sol not possible");
           }
            //System.out.println("total ways to solve n queens ="+count);
        }

        public static boolean nQueens(char board[][],int row)//normal case all ways
        {
            //base case ke liye parametr trsck karo konsa kaam ho rha h
            if(row==board.length){
                //printBoard(board);
                count++;//count ways
                return true;

            }
            //colummn loop
            for(int j=0;j<board.length;j++){
                if(isSafe(board,row,j)){
                    board[row][j]='Q';
                    if(nQueens(board,row+1)){
                        return true;
                    }//fxn recursive calls
                    board[row][j]='x';//backtracking step
                }

            }
            return false;
        }
        public static boolean isSafe(char board[][],int row,int col){
            //vertical up
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            //diagonal left up
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            //diagonal right up
            for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
        }
        public static void printBoard(char board[][]){
            System.out.println("_____________chess board___________");
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    }


