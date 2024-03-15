package LeetCode;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
    // O(n^3) bad time complexity
    public static int countSubstrings(String s) {
        int len= s.length();
        int ans = 0;
        for (int i = 0; i<len; i++){
            String str = "";
            for (int j = i; j < len; j++) {
                str+=s.charAt(j);
                if(ispalindrome(str)) ans++;
            }
        }
        return ans;
    }
    static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!= str.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }
}
