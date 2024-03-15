package LeetCode;

public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("bcafg","abcd"));
    }
    public static String customSortString(String order, String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        for (char c : order.toCharArray()) {
            int idx = c - 'a';
            ans.append(String.valueOf(c).repeat(count[idx]));
            count[idx] = 0;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (count[c - 'a'] > 0) {
                ans.append(String.valueOf(c).repeat(count[c - 'a']));
            }
        }

        return ans.toString();
    }
}
