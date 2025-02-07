package MY_DSA.Leet;

import java.util.HashMap;

public class Leet1726 {
    public int tupleSameProduct(int[] nums) {
        if(nums.length <4) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int product=nums[i]*nums[j];
                map.put(product, map.getOrDefault(product,0)+1);
            }
        }

        for(int value :map.values()){
            if(value  > 1){
                count += (value * (value -1)/2)*8 ;
            }
        }
        return count;
    }
}

/*Given an array nums of distinct positive integers, return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.



Example 1:

Input: nums = [2,3,4,6]
Output: 8
Explanation: There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
*/