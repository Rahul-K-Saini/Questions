package Others;

import java.util.ArrayList;
import java.util.List;

public class Subarrays {

    public static List<List<Integer>> getAllSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                subarray.add(arr[j]);
                result.add(new ArrayList<>(subarray));
                System.out.println(subarray);
                System.out.println(result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        List<List<Integer>> subarrays = getAllSubarrays(arr);

        System.out.println("All subarrays:");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}
