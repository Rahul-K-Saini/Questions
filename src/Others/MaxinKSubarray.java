package Others;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxinKSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j=1; j<k; j++){
                max = Math.max(max, arr[i+j]);
            }
            list.add(max);
        }
        System.out.println(list);

    }

}
