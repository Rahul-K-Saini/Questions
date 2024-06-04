package LeetCode;

public class AppendCharactersToStringToMakeSubsequence {
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching","coding"));
    }
    public static int appendCharacters(String s, String t) {
        int first = 0, longestPrefix = 0;

        while (first < s.length() && longestPrefix < t.length()) {
            if (s.charAt(first) == t.charAt(longestPrefix)) {

                longestPrefix++;
            }
            first++;
        }


        return t.length() - longestPrefix;
    }
}
