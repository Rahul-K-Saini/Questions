package LeetCode;

public class MinimumStepsToMakeStringAnagram {
    public static void main(String[] args) {
        System.out.println(minSteps("leetcode","practice"));
    }

    public static int minSteps(String s, String t) {
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[t.charAt(i) - 'a']++;
            count[s.charAt(i) - 'a']--;
        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            ans += Math.max(0, count[i]);
        }

        return ans;
    }
}

