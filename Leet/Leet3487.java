package MY_DSA.Leet;

import java.util.HashSet;
import java.util.Set;

public class Leet3487 {
    public int maxSum(int[] nums) {
        int sum=0,maxi=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int n :nums){
            if(!set.contains(n)){
                set.add(n);
                int prev=sum;
                sum+=n;
                maxi=Math.max(maxi,sum);
                if(sum<prev){
                    sum-=n;
                }
            }
        }
        return maxi;
    }
}
//Input: nums = [1,2,3,4,5]
//
//Output: 15
//
//Explanation:
//
//Select the entire array without deleting any element to obtain the maximum sum.
//
//        Example 2:
//
//Input: nums = [1,1,0,1,1]
//
//Output: 1
//
//Explanation:
//
//Delete the element nums[0] == 1, nums[1] == 1, nums[2] == 0, and nums[3] == 1. Select the entire array [1] to obtain the maximum sum.