package MY_DSA.Leet;

public class Leet2401 {
    public int longestNiceSubarray(int[] nums) {
        int curr=0,xor=0,max=0,l=0,r=0;

        while(r<nums.length){
            curr+=nums[r];
            xor^=nums[r];

            while(curr!=xor){
                curr-=nums[l];
                xor^=nums[l];
                l++;
            }

            max=Math.max(r-l+1,max);
            r++;

        }
        return max;
    }
}
/*Example 1:

Input: nums = [1,3,8,48,10]
Output: 3
Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
- 3 AND 8 = 0.
- 3 AND 48 = 0.
- 8 AND 48 = 0.
It can be proven that no longer nice subarray can be obtained, so we return 3.
Example 2:

Input: nums = [3,1,5,11,13]
Output: 1
Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.*/