package MY_DSA.Leet;

public class Leet416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return canPartitionHelper(nums, 0, 0, target, dp);
    }

    private boolean canPartitionHelper(int[] nums, int index, int currentSum, int target, Boolean[][] dp) {
        if (currentSum == target) return true;
        if (currentSum > target || index >= nums.length) return false;

        if (dp[index][currentSum] != null) return dp[index][currentSum];

        boolean include = canPartitionHelper(nums, index + 1, currentSum + nums[index], target, dp);
        boolean exclude = canPartitionHelper(nums, index + 1, currentSum, target, dp);

        return dp[index][currentSum] = include || exclude;
    }
}
