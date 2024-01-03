package GFG;

import java.util.Arrays;
import java.util.Stack;

public class GeeksAndBuildings {
    public static void main(String[] args) {
        int n = 7;
        int[] heights = {9, 7, 6, 5, 4, 3, 2};
        System.out.println(maximum_energy(n,heights));
    }
    public static long maximum_energy(int n, int[] heights) {
        Stack<Integer> s=new Stack<>();
        int[] next_greater_element =new int[n];
        Arrays.fill(next_greater_element,-1);

        for (int i = 0; i < n; i++) {
            while (!s.empty() && heights[s.peek()] < heights[i]) {
                next_greater_element[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }

        long[] dp=new long[n];
        long ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (next_greater_element[i] == -1) {
                dp[i] = heights[i];
            }
            else {
                dp[i] = heights[i] ^ dp[next_greater_element[i]];
            }
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}
