package LeetCode;

import java.util.HashSet;

public class isSubsequence392 {
    public static void main(String[] args) {
        String s = "aaaaaa", t = "bbaaaa";
        System.out.println(isSubsequence(s,t));
    }
    static public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();

        if(m<1)
            return true;

        while(i<n){
            if(tt[i]==ss[j]){
                j++;
            }
            i++;

            if(j==m)
                return true;
        }

        return false;
    }
}
