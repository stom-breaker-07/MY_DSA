package MY_DSA.Leet;

import java.util.Arrays;

public class Leet746 {
    static int DP(int[] cost,int[] marr ,int step){
        if(step>=cost.length) return 0;
        if(marr[step]!=-1) return marr[step];
        marr[step] = Math.min(cost[step]+DP(cost,marr,step+1),cost[step]+DP(cost,marr,step+2));
        return marr[step];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] memo=new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(DP(cost,memo,0),DP(cost,memo,1));
    }
}
