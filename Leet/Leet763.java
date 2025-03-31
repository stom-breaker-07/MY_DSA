package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet763 {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndexMap.put(s.charAt(i), i);
        }

        int maxLast = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            maxLast = Math.max(maxLast, lastIndexMap.get(s.charAt(i)));
            if (i == maxLast) {
                result.add(i - start + 1);
                start = i + 1; // Move to the next partition
            }
        }

        return result;
    }
}
