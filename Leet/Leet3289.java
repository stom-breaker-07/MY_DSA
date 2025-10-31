package MY_DSA.Leet;

import java.util.HashSet;

public class Leet3289 {
    public int[] getSneakyNumbers(int[] nums) {
        int i=0;
        int[] ans=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                ans[i++]=num;
            }
            set.add(num);
        }
        return ans;
    }
}
