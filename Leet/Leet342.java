package MY_DSA.Leet;

public class Leet342 {
    public boolean isPowerOfFour(int n) {
        while (n >= 4) {
            if (n % 4 != 0) {
                return false;
            } else {
                n = n / 4;
            }

        }
        return n==1;
    }
}
/*Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false*/