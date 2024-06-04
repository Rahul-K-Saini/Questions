package CodeForces;

import java.util.Arrays;

public class MinStepsToReverseString {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i=0; i< arr.length; i++){
            arr[i] = (int) Math.round(Math.random());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(rev(arr,0,arr.length-1,0));
        System.out.println(Arrays.toString(arr));
    }
    public static int  rev(int[] arr,int s,int e,int c){
        if(s>=e){
            return c;
        }
        int x=0;
        if(arr[s]==arr[e]){
            x=rev(arr,s+1,e-1,c);
        }else{
            for(int i=s;i<e;i++){
                arr[i] = arr[i]+arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i]-arr[i+1];
            }
            c++;
            x=rev(arr,s,e-1,c);
        }
        return x;
    }
}




