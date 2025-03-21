package MY_DSA.Leet;

import java.util.Arrays;
import java.util.HashMap;

public class Leet1636 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Integer[] newNums = new Integer[nums.length];

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            newNums[i]=nums[i];
        }
        Arrays.sort(newNums,(n1, n2)->{
            if(map.get(n1)!=map.get(n2)){
                return map.get(n1)-map.get(n2);
            }
            else{
                return n2-n1;
            }
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=newNums[i];
        }

        return nums;
    }
}

/*Example 1:

Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:

Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.*/