package Important.LongestCommonSubsequence;

import java.util.Arrays;

public class LCS_DP {
    public static void main(String[] args) {

    }

    // Good LCS Using DP
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] dp = new int[x+1][y+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return LCS_dp(s1,s2,x,y,dp);

    }
    public static int LCS_dp(String str1, String str2, int n, int m, int[][] dp){
        if(n==0 || m==0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(str1.charAt(n-1)==str2.charAt(m-1)) dp[n][m] =  1+LCS_dp(str1,str2, n-1, m-1,dp);
        else
            dp[n][m] =  Math.max(LCS_dp(str1,str2,n,m-1,dp), LCS_dp(str1,str2,n-1,m,dp));
        return dp[n][m];
    }

}
