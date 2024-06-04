package GFG;

import java.util.Arrays;

public class PathToReachOrigin {
    public static void main(String[] args) {
        System.out.println(ways(3,6));
    }
    public static int ways(int x, int y)
    {
        int[][] dp = new int[x+1][y+1];
        for(int i=0; i<=x; i++){
            for(int j=0; j<=y; j++){
                dp[i][j] = -1;
            }
        }
        return helper(x,y,dp);
    }

    private static int helper(int x, int y, int[][] dp) {
        if(x == 0 || y == 0) return 1;

        if(dp[x][y] != -1) return dp[x][y];

        dp[x][y] = helper(x - 1, y, dp) + helper(x, y - 1, dp);

        return dp[x][y];
    }
}
