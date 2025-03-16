package MY_DSA.Leet;

public class Leet198 {
    public int rob(int[] nums) {
        int rob1=0,rob2=0 ;
        for(int n:nums){
            int temp=Math.max(n+rob1 , rob2);
            rob1=rob2;
            rob2=temp;
        }
        return rob2;
    }
}

/*Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.


*/