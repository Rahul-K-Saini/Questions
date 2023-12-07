package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindAllFourSumNumbers {

    public static void main(String[] args) {
       int[] A = {10,2,3,4,5,7,8};
        System.out.println(fourSum(A,23));
    }

    static public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<=n-4; i++){
            for(int j=i+1; j<=n-3; j++){
                int l = j+1;
                int r = n-1;
                while(l<r){
                    int value = arr[i]+arr[j]+arr[l]+arr[r];
                    if(value == k){
                        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[l],arr[r]));
                        if(!ans.contains(list)){
                            ans.add(list);
                        }
                        l++;
                        r--;
                    }
                    else if(value>k){
                        r--;
                    }
                    else l++;
                }

            }
        }
        return ans;
    }
}
