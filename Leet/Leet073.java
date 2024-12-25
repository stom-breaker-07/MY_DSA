package MY_DSA.Leet;

public class Leet073 {
    public void setZeroes(int[][] matrix) {
        boolean flag=false;
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    flag=true;
                    for(int a=0 ;a<row ;a++){
                        if(matrix[a][j]!=0){
                            matrix[a][j]=-10;
                        }
                    }
                    for(int b=0;b<col;b++){
                        if(matrix[i][b]!=0){
                            matrix[i][b]=-10;
                        }
                    }
                }
            }
        }
        if(flag){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(matrix[i][j]==-10){
                        matrix[i][j]=0;
                    }
                }
            }
        }
    }
}

/*

Given an m x n integer matrix matrix, if an element is 0, set its entire
row and column to 0's.

You must do it in place.



Example 1:

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/
