package GFG;

public class NumberOfSubarraysWithMaximumValuesInGivenRange {
    public static void main(String[] args) {
        int[] arr = {2,5,10,4,2};
        System.out.println(countSubarrays(arr,5,1,10));
    }
    static long countSubarrays(int a[], int n, int L, int R)
    {
        long res = 0;
        long exc = 0, inc = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > R) {
                res += (countSubarrys(inc) - countSubarrys(exc));
                inc = 0;
                exc = 0;
            }

            else if (a[i] < L) {
                exc++;
                inc++;
            }
            else {
                res -= countSubarrys(exc);
                exc = 0;
                inc++;
            }
        }
        res += (countSubarrys(inc) - countSubarrys(exc));
        return res;
    }
    static long countSubarrys(long n)
    {
        return n * (n + 1) / 2;
    }
}
