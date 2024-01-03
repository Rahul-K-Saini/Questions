package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Convert2DArrayInto1DArrayWithConditions {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
    public static List<List<Integer>> findMatrix(int[] nums)
    {
        List<List<Integer>>outer=new ArrayList<>();
        int[] arr=new int[201];
        int i,k=0;
        for(i=0;i<nums.length;i++)
            arr[nums[i]]++;
        int max = -1;
        for(int n:arr){
            if(n>max){
                max = n;
            }
        }
        k = max;
        while(k>0)
        {
            List<Integer>inner=new ArrayList<>();
            k--;
            for(i=1;i<201;i++)
            {
                if(arr[i]!=0)
                {
                    inner.add(i);
                    arr[i]--;
                }
            }
            if(!inner.isEmpty())
                outer.add(inner);
        }
        return outer;
    }
}
