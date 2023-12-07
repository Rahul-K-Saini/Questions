package LeetCode;

import java.util.*;

public class DiagonalTraverse2 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        ));

        System.out.println(Arrays.toString(findDiagonalOrder(list)));
    }
    public static int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> groups = new HashMap<>();
        int n = 0;
        for (int row = nums.size() - 1; row >= 0; row--) {
            for (int col = 0; col < nums.get(row).size(); col++) {
                int diagonal = row + col;
                if (!groups.containsKey(diagonal)) {
                    groups.put(diagonal, new ArrayList<Integer>());
                }

                groups.get(diagonal).add(nums.get(row).get(col));
                n++;
            }
        }

        int[] ans = new int[n];
        int i = 0;
        int curr = 0;

        while (groups.containsKey(curr)) {
            for (int num : groups.get(curr)) {
                ans[i] = num;
                i++;
            }

            curr++;
        }

        return ans;
    }
}
