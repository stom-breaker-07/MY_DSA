package MY_DSA.Leet;

import java.util.Arrays;

public class Leet137 {
    public int singleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if((i>0 && nums[i-1]==nums[i]) || (i<nums.length-1 && nums[i+1]==nums[i])){
                continue;
            }else{
                return nums[i];
            }
        }
        return ans;
    }
}
