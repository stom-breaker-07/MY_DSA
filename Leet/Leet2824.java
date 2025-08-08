package MY_DSA.Leet;

import java.util.List;

public class Leet2824 {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;
        for(int i =0;i<n;i++){
            int a = nums.get(i);
            for(int j = i+1;j<n;j++){
                int b = nums.get(j);
                if(a+b<target) count++;
            }
        }
        return count;
    }
}
