package MY_DSA.Leet;

public class Leet922 {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        int even=0,odd=1;

        for(int num:nums){
            if(num%2==0){
                ans[even]=num;
                even+=2;
            }else{
                ans[odd]=num;
                odd+=2;
            }
        }
        return ans;
    }
}
 /*Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.



Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.*/