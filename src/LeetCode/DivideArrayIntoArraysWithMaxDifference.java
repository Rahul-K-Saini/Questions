package LeetCode;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,7,9,3,5,1};
        int[][] ans = divideArray(arr,2);
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] divideArray(int[] nums,final int k) {
        Arrays.sort(nums);
        int row = nums.length/3;
        int[][] ans = new int[row][3];
        int idx = 0;
        for(int i=0; i<row; i++){
            ans[i][0] = nums[idx];
            idx++;
            for(int j=1; j<3; j++){
                if(nums[idx]-ans[i][j-1]<=k){
                    if(j==2){
                        if(nums[idx]-ans[i][j-2]>k){
                            return new int[][]{};
                        }
                    }
                    ans[i][j] = nums[idx];
                    idx++;
                }
                else return new int[][]{};
            }
        }
        return ans;
    }
}
