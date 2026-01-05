package MY_DSA.Leet;

public class Leet1975 {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        long min = Long.MAX_VALUE;
        int neg = 0;

        for (int[] row : matrix) {
            for (int x : row) {
                if (x < 0) neg++;
                sum += Math.abs(x);
                min = Math.min(min, Math.abs(x));
            }
        }

        if (neg % 2 == 1) sum -= 2 * min;

        return sum;
    }
}
