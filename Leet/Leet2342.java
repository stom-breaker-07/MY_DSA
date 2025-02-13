package MY_DSA.Leet;

import java.util.HashMap;

public class Leet2342 {
    public int maximumSum(int[] nums) {
        int max=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=0;
            int ele=nums[i];
            while(ele>0){
                num+=ele%10;
                ele/=10;
            }
            if(map.containsKey(num)){
                int val=map.get(num);
                max=Math.max(max,val+nums[i]);
            }
            map.put(num, Math.max(map.getOrDefault(num, 0), nums[i]));
        }
        return  max;
    }
}

/*Input: nums = [18,43,36,13,7]
Output: 54
Explanation: The pairs (i, j) that satisfy the conditions are:
- (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
- (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
So the maximum sum that we can obtain is 54.
Example 2:

Input: nums = [10,12,19,14]
Output: -1
Explanation: There are no two numbers that satisfy the conditions, so we return -1.*/