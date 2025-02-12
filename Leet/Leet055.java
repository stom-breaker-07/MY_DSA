package MY_DSA.Leet;

public class Leet055 {
    public boolean canJump(int[] nums) {
        int jump=0;
        for(int i=0;i<nums.length;i++){
            if(i > jump) return false;
            jump=Math.max(jump,i+nums[i]);
            if(jump >= nums.length-1)return true;
        }
        return false;
    }
}
/*Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what.
Its maximum jump length is 0, which makes it impossible to reach the last index.*/