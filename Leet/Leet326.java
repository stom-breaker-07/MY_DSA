package MY_DSA.Leet;

public class Leet326 {
    public boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            } else {
                n = n / 3;
            }
        }
        return n==1;
    }
}
/*Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.*/