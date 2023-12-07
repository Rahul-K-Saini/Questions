package Others;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumOfTwoElements {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5};
        int[] b = {2, 6, 8, 10};
        int n = a.length;
        int k = 4;

        ArrayList<Integer> result = maxKsum(a, b, n, k);
        System.out.println(result);
    }

    private static ArrayList<Integer> maxKsum(int[] a, int[] b, int n, int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        helper(a, b, n, k, ans);
        return ans;
    }

    static void helper(int[] a, int[] b, int n, int k, ArrayList<Integer> ans) {
        if (k == 0 || n == 0)
            return;

        if (k == 1) {
            ans.add(a[n - 1] + b[n - 1]);
            helper(a, b, n - 1, k - 1, ans);
        } else if (n >= 2) {
            ans.add(a[n - 1] + b[n - 1]);
            ans.add(Math.max(a[n - 1] + b[n - 2], a[n - 2] + b[n - 1]));
            k -= 2;
            helper(a, b, n - 2, k, ans);
        } else {
            ans.add(a[n - 1] + b[n - 1]);
            k--;
            helper(a, b, n - 1, k, ans);
        }
    }
}
