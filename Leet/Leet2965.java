package MY_DSA.Leet;

public class Leet2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length;
        int[] set=new int[len*len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                set[grid[i][j]-1]++;
            }
        }

        int dup=0,miss=0;
        for(int i=0;i<set.length;i++){
            if(set[i]==0){
                miss=i+1;
            }
            if(set[i]==2){
                dup=i+1;
            }
        }
        return new int[] {dup,miss};
    }
}
/*Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].*/