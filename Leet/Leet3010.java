package MY_DSA.Leet;

import java.util.Arrays;

public class Leet3010 {
    static int[] arr;
    static int[][] dp;
    static int CalcMinimum(int i,int j){
        if (i >= j) return Integer.MAX_VALUE;
        if (dp[i][j] != -1) return dp[i][j];
        int sum = arr[0] + arr[i] + arr[j];
        return dp[i][j] = Math.min(
                sum , Math.min(CalcMinimum(i + 1, j), CalcMinimum(i, j - 1))
        );
    }

    public int minimumCost(int[] nums) {
        arr = nums;
        int len=nums.length;
        int l=1,r=len-1;
        dp =new int[len][len];
        for(int i=0;i<len;i++){
            Arrays.fill(dp[i],-1);
        }
        return CalcMinimum(l,r);
    }
}
