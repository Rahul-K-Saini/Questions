package GFG;

public class SumOfAllSubstring {
    public static void main(String[] args) {
        String str = "4949530612642323625417080671";
        System.out.println(sumSubstrings(str));
    }
    public static long sumSubstrings(String s)
    {
        long sum = 0;
        for(int i=0; i<s.length(); i++){
            String str = "";
            for(int j=i; j<s.length(); j++){
                str+=s.charAt(j);
                sum+=Long.parseLong(str);
            }
        }
        return sum;
    }
}
