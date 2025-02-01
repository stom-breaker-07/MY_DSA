package MY_DSA.Leet;

public class Leet3151 {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] % 2 == 0 && nums[i+1]%2 == 0){
                return false;
            }
            else if(nums[i] % 2 != 0 && nums[i+1] % 2 != 0){
                return false;
            }
            continue;
        }
        return true ;
    }
}

/*
An array is considered special if every pair of its adjacent elements contains two numbers with different parity.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
Input: nums = [1]

Output: true

Explanation:

There is only one element. So the answer is true.

Example 2:

Input: nums = [2,1,4]

Output: true

Explanation:

There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.*/