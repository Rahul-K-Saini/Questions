package GFG;

import java.util.HashMap;
import java.util.Map;

public class GeekAndGeekinaPurchasingIceCream {
    public static void main(String[] args) {
        System.out.println(findGoodPairs(new int[]{1,2,2,1,2,},5,2));
    }
    static long findGoodPairs(int[] a, int n, int k){
        // Code your solution here.
        long ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = k; i < n; i++){
            hm.put(a[i - k], hm.getOrDefault(a[i - k], 0) + 1);
            ans += hm.getOrDefault(a[i], 0);
            System.out.println(hm);
        }
        return ans;
    }
}
