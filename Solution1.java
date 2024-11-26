package MY_DSA;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
        public long maximumSubarraySum(int[] nums, int k) {
            int j=0; long curr=0;
            while (j + k <= nums.length) {
                Set<Integer> uniqueElements = new HashSet<>();
                long sum=0;
                boolean hasDup = false;
                for (int i = j; i < j + k; i++) {
                    if (!uniqueElements.add(nums[i])) {
                        hasDup = true;
                        break;
                    }
                    sum += nums[i];
                }
                if (!hasDup) {
                    curr = Math.max(curr, sum);
                }

                sum = 0;
                j++;
            }

            return curr;
        }

}
