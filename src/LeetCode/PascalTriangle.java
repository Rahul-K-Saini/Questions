package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 10;
        ArrayList<ArrayList<Integer>> result = pascalsTriangle(numRows);
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }

    static ArrayList<ArrayList<Integer>> pascalsTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (numRows <= 0) {
            return ans;
        }

        ans.add(new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);

            ArrayList<Integer> prevRow = ans.get(i - 1);
            for (int j = 1; j < i; j++) {
                list.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            list.add(1);
            ans.add(list);
        }

        return ans;
    }
}
