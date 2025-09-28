package MY_DSA.Leet;

import java.util.Arrays;

public class Leet976 {
    public int largestPerimeter(int[] nums) {
        int i=0,sum=0;
        Arrays.sort(nums);
        while(i<nums.length-2 ){
            if(nums[i]+nums[i+1]>nums[i+2] || (nums[i]==nums[i+1] && nums[i+1]==nums[i+2])) sum=nums[i]+nums[i+1]+nums[i+2];
            i++;
        }
        return sum;
    }
}
