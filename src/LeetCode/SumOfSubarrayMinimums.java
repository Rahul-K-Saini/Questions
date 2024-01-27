package LeetCode;

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        int[] arr = {11,81,94,43,3};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (i==j){
                    min = Math.min(min,arr[j]);
                    sum+= arr[j];
                    continue;
                }
                min = Math.min(min,arr[j]);
                sum += min;
            }
        }
        return sum;
    }
}
