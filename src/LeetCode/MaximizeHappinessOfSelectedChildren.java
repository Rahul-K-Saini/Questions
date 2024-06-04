package LeetCode;
import java.util.Arrays;

public class MaximizeHappinessOfSelectedChildren {
    public static void main(String[] args) {
        int[] arr = {12,1,42};
        System.out.println(maximumHappinessSum(arr,3));
    }
    static long maximumHappinessSum(int[] arr, int k) {
       Arrays.sort(arr);
        int i=0;
        int idx = arr.length-1;
        long ans = 0;
        while(k--!=0){
            long max =arr[idx--]-i++;
            if(max <= 0) break;
            ans+=max;
        }
        return ans;
    }
}


