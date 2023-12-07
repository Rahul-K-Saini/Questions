package Important.LongestCommonSubsequence;

import static Important.LongestCommonSubsequence.LCS_DP.lcs;
import static Important.LongestCommonSubsequence.LCS_DP_Brain.lcs2;
import static Important.LongestCommonSubsequence.LCS_REC.LCS;

public class Main {
    public static void main(String[] args) {
        String str = "abcefhijklmnqstuvwxyzabcdefghijklmnopqrstuvwxyzabcd";
        String str2 = "abcdfgijklmnpqrstuvxzabcdefghijabcdefghijklmno";
//        System.out.println(LCS(str,str2,40,35)); // recursion
        System.out.println(lcs(35,30,str,str2)); // DP
        System.out.println(lcs2(35,30,str,str2)); // DP on steroid
    }
}
