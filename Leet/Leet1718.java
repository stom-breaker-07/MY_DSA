package MY_DSA.Leet;

public class Leet1718 {
    public int[] constructDistancedSequence(int n) {
        int[] ans=new int[2*n-1];
        boolean[] mark=new boolean[n+1];
        backtrack(ans,mark,n,0);
        return ans;
    }
    private boolean backtrack(int[] ans,boolean[] mark,int n,int in){
        while(in < ans.length && ans[in] != 0){
            in++;
        }
        if(in == ans.length){
            return true;
        }
        for(int i=n;i>=1;i--){
            if(mark[i]) continue;

            if(i==1){
                ans[in]=1;
                mark[1]=true;
                if(backtrack(ans,mark,n,in+1)) return true;
                mark[1]=false;
                ans[in]=0;
            }
            else{
                if( in+i < ans.length && ans[in+i] == 0 ){
                    ans[in]=i;
                    ans[in+i]=i;
                    mark[i]=true;
                    if(backtrack(ans,mark,n,in+1)) return true;
                    mark[i]=false;
                    ans[in+i]=0;
                    ans[in]=0;
                }
            }
        }
        return false;
    }
}
/*Example 1:

Input: n = 3
Output: [3,1,2,3,2]
Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
Example 2:

Input: n = 5
Output: [5,3,1,4,3,5,2,4,2]
 */