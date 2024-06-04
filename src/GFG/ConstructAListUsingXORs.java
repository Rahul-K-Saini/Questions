package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class ConstructAListUsingXORs {
    public static void main(String[] args) {
        int[][] quries = {
                {0 ,6},
                {0 ,3},
                {0 ,2},
                {1 ,4},
                {1 ,5},
        };

        System.out.println(constructList(5,quries));
    }
    public static ArrayList<Integer> constructList(int q, int[][] queries) {

        int xor = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {
            if (queries[i][0] == 0) {
                ans.add(queries[i][1] ^ xor);
            } else {
                xor ^= queries[i][1];
            }
        }
        ans.add(xor);

        Collections.sort(ans);
        return ans;
    }
}
