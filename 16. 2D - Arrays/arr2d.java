import java.util.*;
public class arr2d{
    public static void main(String args[]){
        int matrix[][]=new int[2][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //print matrix
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

        System.out.println(search(matrix,5));
    }

    public static boolean search(int matrix[][],int key){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
}