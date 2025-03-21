package MY_DSA.Leet;

public class Leet581 {
    public int findUnsortedSubarray(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<nums.length-1 && nums[l]<=nums[l+1]){
            l++;
        }
        if(l == nums.length-1){
            return 0;
        }
        while(r > 0 && nums[r - 1] <= nums[r]){
            r--;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        while (l > 0 && nums[l - 1] > min) {
            l--;
        }

        while (r < nums.length - 1 && nums[r + 1] < max) {
            r++;
        }

        return r-l+1;
    }
}
/*Example 1:

Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Example 2:

Input: nums = [1,2,3,4]
Output: 0*/