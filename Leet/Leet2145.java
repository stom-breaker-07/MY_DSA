package MY_DSA.Leet;

public class Leet2145 {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long a = 0, maxima = 0, minima = 0;
        for (int i = 0 ; i < differences.length; i++) {
            a +=  differences[i];
            maxima = Math.max(maxima, a);
            minima = Math.min(minima, a);
        }
        return (int) Math.max(0, (upper - lower) - (maxima - minima) + 1);
    }
}
/*Example 1:

Input: differences = [1,-3,4], lower = 1, upper = 6
Output: 2
Explanation: The possible hidden sequences are:
- [3, 4, 1, 5]
- [4, 5, 2, 6]
Thus, we return 2.*/