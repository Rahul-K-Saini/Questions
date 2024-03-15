package GFG;

public class CheckIfGivenStringIsInteger {

    public static int atoi(String s) {
        if(s.charAt(0)-'0'<0) return -1;
        boolean isNegative = s.charAt(0) == '-';
        int ans = 0;
        if(!isNegative)  ans = s.charAt(0)-'0';
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(c-'0'>=0 && c-'0'<=9){
                int digit = c - '0';
                ans = ans*10 + digit;
            }
            else return -1;
        }
        if(isNegative){
            return ans - 2*ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(atoi("000100"));
    }

}
