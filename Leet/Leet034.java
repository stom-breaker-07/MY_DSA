package MY_DSA.Leet;

public class Leet034 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        if(nums.length == 1 && nums[0]==target ){
            int[]  ar={0,0};
            return ar;
        }
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==target){
                ans[0]=i;
                while(nums[i]==target){
                    ans[1]=i;
                    i++;
                    if(i<nums.length  ){
                        continue;
                    }
                    else{
                        break;
                    }

                }
                break;
            }
        }
        return ans ;
    }
}


//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]