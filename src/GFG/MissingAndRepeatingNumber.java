package GFG;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        System.out.println(Arrays.toString(findTwoElement(arr,3)));
    }
    static int[] findTwoElement(int a[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        long sum = 0;
        for (int j : a) {
            sum += j;
            if (!set.contains(j)) {
                set.add(j);
            } else {
                ans[0] = j;
            }
        }
        sum-=ans[0];
       long apSum = ((long) (n *(n+1))/2);
        ans[1] =(int)(apSum-sum);
        return ans;
    }
}
