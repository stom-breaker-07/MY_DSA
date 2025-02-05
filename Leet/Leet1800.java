package MY_DSA.Leet;

public class Leet1800 {
    public int maxAscendingSum(int[] nums) {
        int count=nums[0],prev=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<=nums[i]){
                prev=Math.max(count,prev);
                count=nums[i+1];
            }else{
                count+=nums[i+1];
            }
        }
        return Math.max(prev,count);
    }
}
/*Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
*/