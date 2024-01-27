package GFG;
public class SubsetSumProblem {
    public static boolean isSubsetSum(int N, int arr[], int sum) {
        int res = 0;
        int idx = 0;
        return helper(res, N, arr, sum, idx);
    }
    private static boolean helper(int res, int n, int[] arr, int sum, int index) {
        if (res == sum) {
            return true;
        }
        if (index >= n) {
            return false;
        }
        boolean take = false;
        if(arr[index]<=sum) take = helper(res + arr[index], n, arr, sum, index + 1);
        boolean notTake = helper(res, n, arr, sum, index + 1);
        return take || notTake;
    }

    public static void main(String[] args) {
        int N = 26;
        int arr[] = {3, 34, 4, 12, 5, 2,5,2,6,7,3,45,7,5,3,234,45,23,45,6,7,45,32,4,34,23};
        int sum = 32328;
        System.out.println(isSubsetSum(N, arr, sum));
    }
}
