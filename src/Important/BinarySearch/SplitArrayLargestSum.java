package Important.BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int K = 3;
        int[] arr = {1, 2, 3, 4};
        System.out.println(splitArray(arr,K));
    }

    // 1. Linear Approach
    static int splitArray(int[] arr, int k){
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        for (int n: arr){
            hi += n;
            lo = Math.max(n,lo);
        }
        for(int i = lo; i <=hi; i++) {
            int maxMin = allocation(arr,k,i);
            if(maxMin==k){
                return i;
            }
        }
        return -1;
    }

    private static int allocation(int[] arr, int k, int i) {
        int n = 1, sumAllocated = 0;
        for (int j = 0; j < arr.length; j++) {
           if((sumAllocated + arr[j])<=i){
               sumAllocated += arr[j];
           }
           else{
               n++;
               sumAllocated = arr[j];
           }
        }
        return n;
    }
}
