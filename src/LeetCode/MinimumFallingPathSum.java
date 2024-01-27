package LeetCode;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}};
        System.out.println(minFallingPathSum(matrix));
    }
    public static int minFallingPathSum(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int ans = Integer.MAX_VALUE;
        System.arraycopy(matrix[0], 0, dp[0], 0, col);
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j==0) {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
                }
                else if (j==col-1){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j], dp[i-1][j-1]);
                }
                else{
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
                }
            }
        }
        for (int i = 0; i < col; i++) {
            ans = Math.min(dp[row-1][i],ans);
        }
        return ans;

    }
    public static int minFallingPathSumGPTSol(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

                int[][] dp = new int[rows][cols];

        // Copy the first row from the original matrix to dp
        for (int i = 0; i < cols; i++) {
            dp[0][i] = matrix[0][i];
        }

        // Iterate through the matrix starting from the second row
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Find the minimum value from the three adjacent cells in the row above
                int minPrev = dp[i - 1][j];
                if (j > 0) {
                    minPrev = Math.min(minPrev, dp[i - 1][j - 1]);
                }
                if (j < cols - 1) {
                    minPrev = Math.min(minPrev, dp[i - 1][j + 1]);
                }
                // Update the current cell in dp with the minimum falling path sum
                dp[i][j] = matrix[i][j] + minPrev;
            }
        }

        // Find the minimum value in the last row of dp, which represents the minimum falling path sum
        int minSum = dp[rows - 1][0];
        for (int j = 1; j < cols; j++) {
            minSum = Math.min(minSum, dp[rows - 1][j]);
        }

        return minSum;
    }
}
