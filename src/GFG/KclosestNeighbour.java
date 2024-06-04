package GFG;

import java.util.Arrays;

public class KclosestNeighbour {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printKClosest(new int[]{1, 2, 3, 6, 10}, 5, 3, 4)));
    }
    static int[] printKClosest(int[] arr, int n, int k, int x) {
        int idx = binarySearch(arr,x,n);
        int s=idx-1;
        int e=idx+1;
        int[] ans = new int[k];
        int i =0;
        if(arr[idx]!=x){
            ans[i++] = arr[idx];
            k--;
        }
        while (k--!=0){
            if((x-arr[s])>(arr[e]-x)){
                ans[i++] = arr[e];
                e++;
            }
            else if((x-arr[s])<(arr[e]-x)){
                ans[i++] = arr[s];
                s--;
            }
            else{
                ans[i++] = arr[e];
                e++;
            }
        }
        return ans;
    }
    static int binarySearch(int[] arr, int target, int size){
        int s = 0;
        int e = size-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]>target){
                e = m-1;
            }
            else if(arr[m]<target){
                s = m+1;
            }
            else{
                return m;
            }
        }
        return e;
    }
}
