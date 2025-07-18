package MY_DSA.Leet;

import java.util.HashSet;
import java.util.Set;

public class Leet128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);

        int maxL=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int curr=n;
                int len=1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                maxL=Math.max(maxL,curr);
            }
        }
        return maxL;
    }
}
