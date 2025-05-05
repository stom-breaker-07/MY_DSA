package MY_DSA.Leet;

import java.util.HashMap;

public class Leet525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int length = i - prevIndex;
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
