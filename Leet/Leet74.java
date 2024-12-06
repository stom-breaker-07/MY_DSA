package MY_DSA.Leet;

public class Leet74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean is=false;
        for(int i=0 ;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    is=true;
                    return is;
                }
            }
        }
        return is;
    }
}


//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.