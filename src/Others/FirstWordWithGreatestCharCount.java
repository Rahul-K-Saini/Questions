package Others;

import java.util.Arrays;

public class FirstWordWithGreatestCharCount {
    public static void main(String[] args) {
        String str = "dasdgwag sfafv safaewf sefeferr esfwefdvr wefwef werfwrfbd raewr dbd wqeragsd    ";
        System.out.println(fun(str));
    }

    public static String fun(String str){
        String[] arr = str.split(" ");
        int totalMax = Integer.MIN_VALUE;
        String ans = "";
        for(String s:arr){
           int[] freq = new int[26];
           char[] chars = s.toCharArray();
           int max = Integer.MIN_VALUE;
           for (char c:chars){
                freq[c-'a']++;
                max = Math.max(max,freq[c-'a']);
           }
            Arrays.fill(freq, 0);
           if(max>totalMax){
               totalMax = max;
               ans = s;
           }

        }
        return ans;
    }
}
