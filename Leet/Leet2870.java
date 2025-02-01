package MY_DSA.Leet;

import java.util.HashMap;

public class Leet2870 {
    public int minOperations(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int val:map.values()){
            if(val == 1){
                return -1;
            }
            count+=val/3;
            val%=3;

            if (val > 0){
                count++;
            }
        }

        return count;
    }
}
/*You are given a 0-indexed array nums consisting of positive integers.

There are two types of operations that you can apply on the array any number of times:

Choose two elements with equal values and delete them from the array.
Choose three elements with equal values and delete them from the array.
Return the minimum number of operations required to make the array empty, or -1 if it is not possible.

 */
