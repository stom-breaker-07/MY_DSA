package MY_DSA.Leet;

public class Leet231 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n&(n-1))==0;
    }
}
/*Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1*

O(1) approch
 */