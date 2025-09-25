package MY_DSA.Leet;

import java.util.List;

public class Leet120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len=triangle.size();
        int[] dp=new int[len];

        for(int i=0;i<len;i++){
            dp[i]=triangle.get(len-1).get(i);
        }

        for(int row=len-2;row>=0;row--){
            for(int col=0;col<=row;col++){
                dp[col]= triangle.get(row).get(col) + Math.min(dp[col],dp[col+1]);
            }
        }

        return dp[0];
    }
}
