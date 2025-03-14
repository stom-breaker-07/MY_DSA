package MY_DSA.Leet;

public class Leet3356 {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int sum = 0, queryCount = 0;
        int[] diffArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            while (sum + diffArray[i] < nums[i]) {
                queryCount++;
                if (queryCount > queries.length) return -1;

                int left = queries[queryCount - 1][0];
                int right = queries[queryCount - 1][1];
                int value = queries[queryCount - 1][2];

                if (right >= i) {
                    diffArray[Math.max(left, i)] += value;
                    if (right + 1 < diffArray.length) {
                        diffArray[right + 1] -= value;
                    }
                }
            }
            sum += diffArray[i];
        }
        return queryCount;
    }
}

/*Input: nums = [2,0,2], queries = [[0,2,1],[0,2,1],[1,1,3]]

Output: 2

Explanation:

For i = 0 (l = 0, r = 2, val = 1):
Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
The array will become [1, 0, 1].
For i = 1 (l = 0, r = 2, val = 1):
Decrement values at indices [0, 1, 2] by [1, 0, 1] respectively.
The array will become [0, 0, 0], which is a Zero Array. Therefore, the minimum value of k is 2.*/