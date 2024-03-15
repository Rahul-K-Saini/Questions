package GFG;

import java.util.HashMap;
import java.util.Map;

public class FindSubarraySumEqualsZero1 {
    public static void main(String[] args) {
        System.out.println(findSubarray(new long[]{0 ,0 ,5 ,5 ,0 ,0},6));
    }
    public static long findSubarray(long[] arr ,int n)
    {
        Map<Long,Integer> map = new HashMap<>();
        map.put((long)0,1);
        long count = 0;
        for(long num:arr){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                count+=map.get(num);
                map.put(num,map.get(num)+1);
            }

        }
        return count;
    }
}
