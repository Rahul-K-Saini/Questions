package LeetCode;
// https://leetcode.com/problems/min-cost-climbing-stairs/?envType=daily-question&envId=2023-10-13
import java.util.Arrays;
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {10,15,20,5,30,45}; // {10,15,30,20,50,50}
        System.out.println(minCostClimbingStairs(arr));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for(int i = 2; i < n; i++) {
            cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);
        }
        System.out.println(Arrays.toString(cost));
        return Math.min(cost[n-1],cost[n-2]);
    }
}
