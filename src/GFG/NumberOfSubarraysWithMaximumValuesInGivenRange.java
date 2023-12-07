package GFG;

public class NumberOfSubarraysWithMaximumValuesInGivenRange {
    public static void main(String[] args) {
        int[] arr = {2,0,11,3,0};
        System.out.println(countSubarrays(arr,5,1,10));
    }
    static long countSubarrays(int a[], int n, int L, int R) {
        long ans = 0;
        int count = 0;
        long exec = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] <= R) {
                count++;
                if (a[i] < L) {
                    exec++;
                }
            } else {
                ans += subarrays(count) - subarrays(exec);
                count = 0;
                exec = 0;
            }
        }

        ans += subarrays(count) - subarrays(exec);

        return ans;
    }

    static long subarrays(long n) {
        return (n * (n + 1)) / 2;
    }
}
