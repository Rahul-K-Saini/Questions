package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC2225 {
    public static void main(String[] args) {
        System.out.println(findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}));
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] match : matches) {
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        for (var entry:map.entrySet()){
            if(entry.getValue()==1) ans1.add(entry.getKey());
        }
        List<Integer> ans0 = new ArrayList<>();
        for (int[] match : matches) {
            if(!map.containsKey(match[0]) && !ans0.contains(match[0])) ans0.add(match[0]);
        }

        list.add(ans0);
        list.add(ans1);
        return list;
    }
}
