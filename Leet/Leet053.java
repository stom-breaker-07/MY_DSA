package MY_DSA.Leet;

public class Leet053 {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<len;i++){
            curr+=nums[i];
            if(curr>max){
                max=curr;
            }if(curr<0){
                curr=0;
            }
        }
        return max;
    }
}

//Kadane's Algorithm

//Given an integer array nums, find the subarray with the largest sum, and return its sum.



//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
