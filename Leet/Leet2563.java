package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2563 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return cntPair(nums,upper)-cntPair(nums,lower-1);
    }

    private long cntPair(int[] nums,int target){
        int i=0,j=nums.length-1;
        long cnt=0;
        while(i<j){
            if(nums[i]+nums[j] <=target){
                cnt+=(j-i);
                i++;
            }else{
                j--;
            }
        }
        return cnt;
    }
}

/*Example 1:

Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
Output: 6
Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).*/