package MY_DSA.Leet;

public class Leet2874 {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        int imax=0,submax=0;
        for(int num:nums){
            res=Math.max(res,(long)submax*num);
            submax=Math.max(submax,imax-num);
            imax=Math.max(imax,num);
        }
        return res;
    }
}
/*Input: nums = [1,10,3,4,19]
Output: 133
Explanation: The value of the triplet (1, 2, 4) is (nums[1] - nums[2]) * nums[4] = 133.
It can be shown that there are no ordered triplets of indices with a value greater than 133.
Example 3:

Input: nums = [1,2,3]
Output: 0
Explanation: The only ordered triplet of indices (0, 1, 2) has a negative value of (nums[0] - nums[1]) * nums[2] = -3. Hence, the answer would be 0.*/