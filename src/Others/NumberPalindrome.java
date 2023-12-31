package Others;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(56));
    }
    static boolean isPalindrome(int n){
        return palindrome(n,n,0);
    }
    static boolean palindrome(int n,int original, int num){
        if(n==0) return original==num;
        int d = n%10;
        return palindrome(n/10,original,num*10 + d);
    }
}