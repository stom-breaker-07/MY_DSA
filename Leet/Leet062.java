package MY_DSA.Leet;

public class Leet062 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) continue;
                int up = dp[i - 1][j];
                int left = dp[i][j - 1];
                dp[i][j] = up + left;
            }
        }
        return dp[m][n];
    }
}

// Bottoum up Approach  or Tabulation