package MY_DSA.Leet;

public class leet154 {
    public int findMin(int[] nums) {
        int min=nums[0],cnt=0;
        for(int i :nums){
            if(min > i){
                return i;
            }
        }
        return nums[0];
    }
}
/*Example 1:

Input: nums = [1,3,5]
Output: 1
Example 2:

Input: nums = [2,2,2,0,1]
Output: 0*/