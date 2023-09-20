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

}
