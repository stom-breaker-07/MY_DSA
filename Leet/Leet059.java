package MY_DSA.Leet;

public class Leet059 {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int total=1;
        int Tr=0,Br=n-1,Rc=n-1,Lc=0;
        while(total<=n*n){
            for(int j=Lc ;j<=Rc && total<=n*n;j++){
                ans[Tr][j]=total++;

            }
            Tr++;
            for(int i=Tr;i<=Br && total<=n*n;i++){
                ans[i][Rc]=total++;

            }
            Rc--;
            for(int j=Rc;j>=Lc && total<=n*n;j--){
                ans[Br][j]=total++;

            }
            Br--;
            for(int i=Br;i>=Tr && total<=n*n;i--){
                ans[i][Lc]=total++;
            }
            Lc++;
        }
        return ans;
    }
}

//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
//
//Example 1:
//
//
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
//Example 2:
//
//Input: n = 1
//Output: [[1]]
