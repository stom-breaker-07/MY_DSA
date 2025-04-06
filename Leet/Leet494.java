package MY_DSA.Leet;

public class Leet494 {
    public int findTargetSumWays(int[] nums, int target) {
        return rec(nums, target, nums.length-1);
    }
    private static int rec(int[] nums, int target, int index){
        if(index == 0){
            return ((target == nums[index])? 1 : 0) + ((target == -nums[index])? 1 : 0);
        }
        int add = rec(nums, target - nums[index], index-1);
        int sub = rec(nums, target + nums[index], index-1);
        return add + sub;
    }
}
/*Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3*/