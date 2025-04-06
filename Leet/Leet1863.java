package MY_DSA.Leet;

public class Leet1863 {
    public int subsetXORSum(int[] nums) {
        int total=0;
        for(int num :nums){
            total|=num;
        }
        return total * (1<<(nums.length-1));
    }
}
/*Example 1:

Input: nums = [1,3]
Output: 6
Explanation: The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6*/