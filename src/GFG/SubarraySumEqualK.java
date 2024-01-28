package GFG;

import java.util.HashMap;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        System.out.println(findSubArraySum(new int[]{10 , 2, -2, -20, 10},-10));
    }
    static int findSubArraySum(int nums[], int k)
    {
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        hashMap.put(0,1);
        for (int num : nums) {
            sum += num;
            if (hashMap.containsKey(sum - k)) {
                ans += hashMap.get(sum - k);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
