package MY_DSA.Leet;

public class Leet2206 {
    public boolean divideArray(int[] nums) {
        int[] numbers=new int[501];
        for(int i :nums){
            numbers[i]++;
        }
        for(int i:numbers){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }
}

/*Example 1:

Input: nums = [3,2,3,2,2,2]
Output: true
Explanation:
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
Example 2:

Input: nums = [1,2,3,4]
Output: false
Explanation:
There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
 */