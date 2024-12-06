package MY_DSA.Leet;

public class Leet240 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row=0, col=matrix[0].length-1, len=matrix.length-1;

        while( col>=0 && row <=len )
        {
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col]>target) col--;
            else if(matrix[row][col]<target) row++;
        }

        return false;

    }
}

//Write an efficient algorithm that searches for a value target
// in an m x n integer matrix matrix. This matrix has the
// following properties:
//
//Integers in each row are sorted in
// ascending from left to right.
//Integers in each column are sorted
// in ascending from top to bottom.
