package LeetCode;

import java.util.Arrays;

public class ProductOfArrayExcpetSelf {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1]*nums[i-1];
        }
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i+1]*nums[i+1];
        }
        for (int i = 0; i < n; i++) {
                nums[i] = left[i]*right[i];
        }
        return nums;
    }
}
