package MY_DSA.Leet;

public class Leet1351 {
    public int countNegatives(int[][] grid) {
        int row=grid.length ,col=grid[0].length;
        int i=row-1,j=0,cnt=0;
        while(i>=0 && j<col){
            if(grid[i][j]<0){
                cnt+=col-j;
                i--;
            }else{
                j++;
            }
        }
        return cnt;
    }
}
/*Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.*/