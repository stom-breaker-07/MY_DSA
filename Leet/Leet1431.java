package MY_DSA.Leet;

import java.util.ArrayList;
import java.util.List;

public class Leet1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int Max = 0;
        for (int cand : candies) {
            Max = Math.max(cand, Max);
        }

        for (int card : candies) {
            if (card + extraCandies >= Max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
