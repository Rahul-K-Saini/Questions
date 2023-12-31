package GFG;

import java.util.Arrays;

public class AntiDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(antiDiagonalPattern(matrix)));
    }
    public static int[] antiDiagonalPattern(int[][] matrix)
    {
        int[] ans = new int[matrix.length* matrix.length];
        int idx = 0;
        for (int j = 0; j < matrix.length; j++) {
            int r = j;
            int i = 0;
            while(r>=0){
                ans[idx] = matrix[i++][r--];
                idx++;
            }
        }
        for(int i = 1; i< matrix.length ; i++) {
            int r = i;
            int j = matrix.length-1;
            while(r< matrix.length){
                ans[idx] = matrix[r++][j--];
                idx++;
            }
        }
        return ans;
    }
}
