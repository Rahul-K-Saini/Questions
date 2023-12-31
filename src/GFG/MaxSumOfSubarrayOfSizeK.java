package GFG;

import java.util.ArrayList;

public class MaxSumOfSubarrayOfSizeK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(2000);
        list.add(1000);
        System.out.println(maximumSumSubarray(2,list,6));
    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N){
        int i=0;
        int j=0;
        long sum = 0;
        while((j-i+1)<=K){
            sum += Arr.get(j);
            j++;
        }
        long max = sum;
        while(j<N){
            sum -= Arr.get(i);
            i++;
            sum += Arr.get(j);
            j++;
            max = Math.max(sum,max);
        }
        return max;
    }
}
