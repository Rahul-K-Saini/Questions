package GFG;

// Standard Prefix-Sum problem

public class EquilibiruimPoint {
    public static void main(String[] args) {
        long[] arr = {1,3,5,2,2};
        System.out.println(equilibriumPoint(arr,5));
    }
    // O(n)
    public static int equilibriumPoint(long arr[], int n) {
        long[] prefix = new long[n];
        prefix[0] = arr[0];
        long[] suffix = new long[n];
        suffix[n-1] = arr[n-1];
        for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        for(int i=n-2; i>=0; i--){
            suffix[i] = arr[i] + suffix[i+1];
        }
        for(int i=0; i<n; i++){
            if(prefix[i] == suffix[i]){
                return i+1;
            }
        }
        return -1;
    }
}
