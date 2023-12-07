package GFG;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        shuffleArray(arr,6);
        System.out.println(Arrays.toString(arr));
    }
    static void shuffleArray(long arr[], int n)
    {
        long[] ans = new long[n];
        int i=1;
        int j=n/2;
        int idx = 1;
        ans[0] = arr[0];
        while(j<n){
            if(idx%2==0){
                ans[idx] = arr[i];
                i++;
            }
            else{
                ans[idx] = arr[j];
                j++;
            }
            idx++;
        }
        System.arraycopy(ans, 0, arr, 0, n);

    }
}
