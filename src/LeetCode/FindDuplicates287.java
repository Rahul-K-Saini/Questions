package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/find-the-duplicate-number/?envType=daily-question&envId=2023-09-19
public class FindDuplicates287 {
    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate2(nums));
    }

    // O(nlogn)
    public static int findDuplicate1(int[] arr) {
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]) return arr[i];
        }
        return -1;
    }

    // O(n) but still not good
    public static int findDuplicate2(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int f = map.get(arr[i]);
                map.put(arr[i],++f);
            }
        }
       for(int n: arr){
           if(map.get(n)>1){
               return n;
           }
       }
       return 0;
    }

    // O(n) good
    public static int findDuplicate3(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }

        return len;
    }

    // Visited better sol O(n)
    public static int findDuplicate_mark(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }

        return len;
    }

}
