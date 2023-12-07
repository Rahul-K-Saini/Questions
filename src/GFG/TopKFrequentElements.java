package GFG;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {6 ,1 ,2, 3, 4, 5 ,6};
        System.out.println(Arrays.toString(topK(nums,6))); // 654321
    }
    public static int[] topK(int[] nums, int k) {
        // Code here
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (mp.containsKey(num)) {
                mp.put(num, mp.get(num) + 1);
            } else
                mp.put(num, 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());

        Collections.sort(
                list,
                (o1, o2) -> {
                    if (o1.getValue().equals(o2.getValue())){
                        if(o2.getKey() > o1.getKey()) return 1;
                        else return -1;
                    }
                    else {
                        if (o2.getValue() > o1.getValue())
                            return 1;
                        else
                            return -1;
                    }
                });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}
