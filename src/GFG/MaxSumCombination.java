package GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSumCombination {
    public static void main(String[] args) {
        int[] A  = {1, 4, 2, 3};
        int[] B  = {2, 5, 1, 6};
        System.out.println(maxCombinations(4,3,A,B));

    }
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0;j<N; j++){
                list.add(A[i]+B[j]);
            }
        }
        Collections.sort(list);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<K; i++){
            ans.add(list.get(list.size()-1-i));
        }
        return ans;
    }
}
