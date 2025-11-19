package MY_DSA.Leet;

import java.util.HashSet;

public class Leet2154 {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        while(set.contains(original)){
            original*=2;
        }

        return original;
    }
}
