package LeetCode;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/?envType=daily-question&envId=2023-10-01

public class ReverseWords557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word : arr) {
            ans.append(new StringBuilder(word).reverse()).append(" ");
        }
        return ans.toString().trim();
    }

}
