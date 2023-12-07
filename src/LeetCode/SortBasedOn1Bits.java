package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortBasedOn1Bits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{1,2,3,4,5,6,7,8,9,0})));
    }
    static int[] sortByBits(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int n = noOfBits(arr[i]);
            if(!map.containsKey(n)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                map.put(n,list);
            }
            else{
                map.get(n).add(arr[i]);
            }
        }
        ArrayList<Integer> allElements = new ArrayList<>();
        for (ArrayList<Integer> list : map.values()) {
            Collections.sort(list);
            allElements.addAll(list);
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = allElements.get(i);
        }
        return ans;
    }
    static int noOfBits(int n){
        int count = 0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
