package GFG;

import java.math.BigInteger;

public class LargestNumberFormedFromArray {
    public static void main(String[] args) {
        System.out.println(printLargest(11,new String[]{"54", "546", "548", "60","669","142", "106", "920", "33", "793", "70"}));
    }
    static String printLargest(int n, String[] arr) {
        String ans = "";
        String first = arr[0] + arr[1];
        String sec = arr[1] + arr[0];
        BigInteger f_int = new BigInteger(first);
        BigInteger s_int = new BigInteger(sec);
        ans = f_int.compareTo(s_int) > 0 ? f_int.toString() : s_int.toString();
        for (int i = 2; i < arr.length; i++) {
            first = ans + arr[i];
            sec = arr[i] + ans;
            f_int = new BigInteger(first);
            s_int = new BigInteger(sec);
            ans = f_int.compareTo(s_int) > 0 ? f_int.toString() : s_int.toString();
        }
        return ans;
    }
}
