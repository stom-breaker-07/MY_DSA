package MY_DSA.Leet;

public class Leet875 {
    class Solution {
        private int getMax(int[] p){
            int max=0,cur=0;
            for(int i=0;i<p.length;i++){
                cur=p[i];
                max=Math.max(cur,max);
            }
            return max;
        }

        private boolean canFinish(int[] piles,int h,int k){
            int count=0;
            for(int i:piles){
                count+=Math.ceil((double) i / k);
            }
            if(count > h){
                return false;
            }
            return true;
        }
        public int minEatingSpeed(int[] piles, int h) {
            int l=1;
            int r=getMax(piles);
            int len=r;
            while( l<=r){
                int m=l+(r-l)/2;
                if (canFinish(piles, h, m)) {
                    len=m;
                    r=m-1;
                } else {
                    l=m+1;
                }
            }
            return len;
        }
    }
}

/*Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
*/