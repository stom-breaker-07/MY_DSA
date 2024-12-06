package MY_DSA.Leet;

public class Leet867 {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i < m;i++){
            for(int j=0;j < n ;j++){
                ans[j][i]=matrix[i][j];
            }
        }

        return ans;
    }
}

//Example 1:
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//Example 2:
//
//Input: matrix = [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]
