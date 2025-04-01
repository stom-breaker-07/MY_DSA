package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet2551 {
    public long putMarbles(int[] weights, int k) {
        if (k==1) return 0;

        List<Integer> pairSums = new ArrayList<>();
        for (int i = 0; i < weights.length - 1; i++) {
            pairSums.add(weights[i] + weights[i + 1]);
        }

        Collections.sort(pairSums);

        long minScore = 0, maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairSums.get(i);
            maxScore += pairSums.get(pairSums.size() - 1 - i);
        }

        return maxScore - minScore;
    }
}

/* Input: weights = [1,3,5,1], k = 2
Output: 4
Explanation:
The distribution [1],[3,5,1] results in the minimal score of (1+1) + (3+1) = 6.
The distribution [1,3],[5,1], results in the maximal score of (1+3) + (5+1) = 10.
Thus, we return their difference 10 - 6 = 4.*/