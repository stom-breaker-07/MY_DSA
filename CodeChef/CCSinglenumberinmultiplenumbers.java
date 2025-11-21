package MY_DSA.CodeChef;

import java.util.HashMap;

public class CCSinglenumberinmultiplenumbers {
    public int singleNumber(int[] nums) {
        // write your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return nums[0];
    }
}
