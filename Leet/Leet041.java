package MY_DSA.Leet;

import java.util.Arrays;

public class Leet041 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int count=1;
        for(int i=0;i<len;i++){
            if(nums[i]>0 && nums[i]==count){
                count++;
            }
        }
        return count;
    }
}

//Optimized Code:

//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        int n = nums.length;
//
//        // Step 1: Place each number in its correct index if possible
//        for (int i = 0; i < n; i++) {
//            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
//                // Swap nums[i] with nums[nums[i] - 1]
//                int temp = nums[i];
//                nums[i] = nums[temp - 1];
//                nums[temp - 1] = temp;
//            }
//        }
//
//        // Step 2: Find the first missing positive
//        for (int i = 0; i < n; i++) {
//            if (nums[i] != i + 1) {
//                return i + 1;
//            }
//        }
//
//        // If all numbers from 1 to n are present, the missing number is n + 1
//        return n + 1;
//    }
//}



//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.


