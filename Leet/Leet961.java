package MY_DSA.Leet;

import java.util.HashSet;

public class Leet961 {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                return n;
            }
        }
        return 1;
    }
}
