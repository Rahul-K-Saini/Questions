package GFG;

public class SmallestWindowContaining012 {
    public static void main(String[] args) {
        System.out.println(smallestSubstring("22112202"));
    }
    public static int smallestSubstring(String S) {
        int lastZero = -1, lastOne = -1, lastTwo = -1;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                lastZero = i;
            } else if (S.charAt(i) == '1') {
                lastOne = i;
            } else {
                lastTwo = i;
            }
            if (lastZero != -1 && lastOne != -1 && lastTwo != -1) {
                ans = Math.min(ans, 1 + i - Math.min(lastZero, Math.min(lastOne, lastTwo)));
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}