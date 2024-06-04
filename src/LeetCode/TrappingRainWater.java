package LeetCode;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{109, 773, 242, 651, 283, 466, 17, 283, 587, 948, 935, 991,
                                            254, 120, 669, 29, 962, 865, 936, 202, 282, 468, 30, 732}));
    }

    public static int trap(int[] height) {
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
       int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(height[i], leftMax);
            left[i] = leftMax;
        }
        for (int i = n - 1; i >= 0; i--) {
            rightMax = Math.max(height[i], rightMax);
            right[i] = rightMax;
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) -height[i];
        }
        return water;
    }
}