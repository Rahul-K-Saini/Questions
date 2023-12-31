package GFG;

public class GoldMineProblem {
    public static void main(String[] args) {
        int[][] M = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};
        System.out.println(maxGold(3, 3, M));
    }

    static int maxGold(int n, int m, int M[][]) {

        int[][] dp = new int[n][m];

        int mx = Integer.MIN_VALUE;

        for (int j = m - 1; j >= 0; j--) {

            for (int i = 0; i < n; i++) {

                if (j == m - 1) {

                    dp[i][j] = M[i][j];

                } else if (i == 0) {

                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], i + 1 < n ? dp[i + 1][j + 1] : 0); //handling single row input

                } else if (i == n - 1) {

                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);

                } else {

                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));

                }

                mx = Math.max(mx, dp[i][j]);

            }

        }

        return mx;

    }
}
