package MY_DSA.Leet;

import java.util.HashSet;

public class Leet2357 {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                uniqueNumbers.add(num);
            }
        }
        return uniqueNumbers.size();
    }
}
/*You are given a non-negative integer array nums. In one operation, you must:

Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
Subtract x from every positive element in nums.
Return the minimum number of operations to make every element in nums equal to 0.*/