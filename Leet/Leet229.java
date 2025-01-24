package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i] ,count=0, j=i;
            while( j < nums.length){
                if(nums[j]==num){
                    count++;
                }
                j++;
            }
            if(count > nums.length/3 && !a.contains(nums[i])){
                a.add(nums[i]);
            }
        }

        return a ;
    }
}

/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.



Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
*/
