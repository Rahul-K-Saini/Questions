package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveNumThatSumToZero {
    public static void main(String[] args) {
        int[] arr = {5,-3,-4,1,6,-2,-5};
        System.out.println(Arrays.toString(removesumtozero(arr)));
    }
    static int[] removesumtozero(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(prefix[i]==prefix[j]){
                break;
            }
            j--;
            i++;
        }
        ArrayList<Integer> resList = new ArrayList<>();
        for (int idx = 0; idx < prefix.length; idx++) {
            if(idx>i && idx<=j){
                continue;
            }
            else resList.add(arr[idx]);
        }
        int[] ans = new int[resList.size()];
        for (int idx = 0; idx < resList.size(); idx++) {
            ans[idx] = resList.get(idx);
        }
        return ans;

    }
}
