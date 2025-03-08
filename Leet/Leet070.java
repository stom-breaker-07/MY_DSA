package MY_DSA.Leet;

public class Leet070 {
    public int climbStairs(int n) {
        if(n<=3)return n;
        int prev=3,prevNxt=2,cur=0;
        for(int i=3;i<n;i++){
            cur=prev+prevNxt;
            prevNxt=prev;
            prev=cur;
        }
        return cur;
    }
}
/*Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps*/