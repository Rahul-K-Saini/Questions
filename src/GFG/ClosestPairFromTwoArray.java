package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPairFromTwoArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7};
        int[] brr = {10,20,30,40};
        System.out.println(printClosest(arr,brr,4,4,32));
    }
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = m-1;
        int a = 0;
        int b = 0;
        while(left<n && right>=0) {
            if (Math.abs(((arr[left] + brr[right]) - x)) < min) {
                min = Math.abs(((arr[left] + brr[right]) - x));
                a = arr[left];
                b = brr[right];
            } else if ((arr[left] + brr[right]) < x) {
                left++;
            } else right--;
        }
        return new ArrayList<>(Arrays.asList(a,b));
    }
}
