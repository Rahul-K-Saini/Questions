package LeetCode;

import java.util.HashMap;

public class NoOfWaysToSplitStringInAGoodWay {
    public static void main(String[] args) {
        String s = "acbadbaada";
        System.out.println(numSplits(s));
    }
    public static int numSplits(String s) {

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c:chars) map1.put(c,map1.getOrDefault(c,0)+1);
        if(map1.size()==1) return s.length()-1;
        int cnt = 0;
        for(char c: chars){
            map1.put(c,map1.get(c)-1);
            if(map1.get(c)==0) map1.remove(c);
            map2.put(c,map2.getOrDefault(c,0)+1);

            if(map1.size() == map2.size()) cnt++;
        }
        return cnt;


    }
}
