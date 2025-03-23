package MY_DSA.Leet;

public class Leet3370 {
    public int smallestNumber(int n) {
        int res=1;
        while(res<n){
            res=res*2+1;
        }
        return res;
    }
}
/*Example 1:

Input: n = 5

Output: 7

Explanation:

The binary representation of 7 is "111".*/