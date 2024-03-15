package GFG;

import java.util.*;

public class RotateKTimes{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        rotateKtimes(arr,k);
        System.out.print(Arrays.toString(arr));
    }
    static void rotateKtimes(int[] arr,int k){
        for(int i=0; i<k; i++){
            for(int j=arr.length-1; j>=1; j--){
                swap(arr,j,j-1);
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}