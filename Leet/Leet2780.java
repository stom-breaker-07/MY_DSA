package MY_DSA.Leet;

import java.util.List;

public class Leet2780 {
    public int minimumIndex(List<Integer> list) {
        int n = list.size();
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0)
                max = list.get(i);
            if (max == list.get(i))
                count++;
            else
                count--;
        }
        count = 0;
        for (int num : list) {
            if (num == max)
                count++;
        }
        if (count <= (n - count) + 1)
            return -1;

        count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == max)
                count++;
            else
                count--;
            if (count == 1)
                return i;
        }
        return -1;
    }
}
/*Input: nums = [1,2,2,2]
Output: 2
Explanation: We can split the array at index 2 to obtain arrays [1,2,2] and [2].
In array [1,2,2], element 2 is dominant since it occurs twice in the array and 2 * 2 > 3.
In array [2], element 2 is dominant since it occurs once in the array and 1 * 2 > 1.
Both [1,2,2] and [2] have the same dominant element as nums, so this is a valid split.
It can be shown that index 2 is the minimum index of a valid split. */