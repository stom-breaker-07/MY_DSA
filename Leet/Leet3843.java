package MY_DSA.Leet;

import java.util.HashMap;

public class Leet3843 {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int freq : map.values()){
            map2.put(freq,map2.getOrDefault(freq,0)+1);
        }

        for(int num :nums){
            int frequency = map.get(num);
            if (map2.get(frequency) == 1) {
                return num;
            }
        }

        return -1;
    }
}
