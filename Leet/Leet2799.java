package MY_DSA.Leet;

import java.util.HashSet;
import java.util.Set;

public class Leet2799 {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> distinctElements = new HashSet<>();
        for (int num : nums) {
            distinctElements.add(num);
        }
        int totalDistinct = distinctElements.size();
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> currentSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                currentSet.add(nums[j]);
                if (currentSet.size() == totalDistinct) {
                    count += (n - j);
                    break;
                }
            }
        }
        return count;
    }
}
