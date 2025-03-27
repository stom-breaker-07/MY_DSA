package MY_DSA.Leet;

import java.util.Arrays;

public class Leet2033 {
        static boolean check(int x, int[][] grid) {
            int mod = grid[0][0] % x;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] % x != mod) {
                        return false;
                    }
                }
            }
            return true;
        }

        public int minOperations(int[][] grid, int x) {
            if (!check(x, grid)) {
                return -1;
            }


            int m = grid.length, n = grid[0].length;
            int[] arr = new int[m * n];
            int idx = 0;

            for (int[] row : grid) {
                for (int num : row) {
                    arr[idx++] = num;
                }
            }


            Arrays.sort(arr);
            int median = arr[arr.length / 2];

            int count = 0;
            for (int num : arr) {
                count += Math.abs(median - num) / x;
            }

            return count;
        }
}
