package Important.LongestCommonSubsequence;

import java.util.Arrays;

public class LCS_REC {

    // Dumb LCS using recursion only
    public static int LCS(String str1, String str2, int n, int m){
        if(n==0 || m==0) return 0;
        if(str1.charAt(n-1)==str2.charAt(m-1)) return 1+LCS(str1,str2, n-1, m-1);
        return Math.max(LCS(str1,str2,n,m-1),LCS(str1,str2,n-1,m));
    }

}
