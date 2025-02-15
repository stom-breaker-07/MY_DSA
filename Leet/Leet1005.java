package MY_DSA.Leet;

import java.util.PriorityQueue;

public class Leet1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);
            count+=num;
        }
        while(k>0){
            int curmin=pq.poll();
            count-=curmin;
            int operation = curmin * -1;
            count+=operation;
            pq.add(operation);
            k--;
        }

        return count;
    }
}
/*Example 1:

Input: nums = [4,2,3], k = 1
Output: 5
Explanation: Choose index 1 and nums becomes [4,-2,3].
Example 2:

Input: nums = [3,-1,0,2], k = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].*/