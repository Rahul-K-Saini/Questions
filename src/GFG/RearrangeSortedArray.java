package GFG;

import java.util.Arrays;

public class RearrangeSortedArray {
    public static void main(String[] args) {
        long[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        rearrange(arr,11);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(long arr[], int n){

        long[] brr = new long[n];
        int i=0;
        int j=n-1;
        int k =0;
        while(i<=j && k<n){
            brr[k++] = arr[j];
            if(k<n)
                brr[k++] = arr[i];
            j--;
            i++;
        }
        int idx = 0;
        for(long num:brr){
            arr[idx] = num;
            idx++;
        }

    }
}
