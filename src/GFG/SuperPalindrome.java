package GFG;

public class SuperPalindrome {
    public static void main(String[] args) {
        System.out.println(countSuperPalindrome(16,100));
    }
    public static int countSuperPalindrome(int l, int r) {
        int count = 0;
        for(int i=l; i<=r; i++){
            if(perfectSquare(i) && isPalindrome(i)){
                count++;
            }

        }
        return count;
    }
    static boolean isPalindrome(int n){

        String org = Integer.toString(n);
        StringBuilder str = new StringBuilder();
        while(n!=0){
            str.append(n%10);
            n = n/10;
        }
        return org.equals(str.toString());

    }
    static boolean perfectSquare(int x){
        if (x >= 0) {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
}
