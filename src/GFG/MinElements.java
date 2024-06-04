package GFG;

import java.util.Arrays;

public class MinElements {
    public static void main(String[] args) {
        int[] arr = {2,7,1};
        int[] arr2 = {6,8,7};
        System.out.println(minElements(3,3,arr,arr2));
    }
    public static int minElements(int n, int m, int[] arr1, int[] arr2) {
        int sum = 0;
        for(int num:arr1){
            sum+=num;
        }
        Arrays.sort(arr2);
        int sum2 = 0;
        int ele =0;
        for(int i=arr2.length-1; i>=0; i--){
            sum2+=arr2[i];
            if(sum2>=sum){
                return ++ele;
            }
            ++ele;
        }
        return -1;
    }
}
