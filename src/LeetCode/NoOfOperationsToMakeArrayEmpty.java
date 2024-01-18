package LeetCode;

import java.util.HashMap;

public class NoOfOperationsToMakeArrayEmpty {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,3,3,2,2,4,2,3,4}));
    }
    public static int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(var value:map.values()){
            if(value==1) return -1;
        }
        int noOfOp = 0;
        for(var entry : map.entrySet()){
            int val = entry.getValue();
            if(val%3==0){
                noOfOp += val/3;
            }
            else if(val == 4) {
                noOfOp+=2;
            } else if (val==2) {
                noOfOp++;
            } else if(val%3==1){
                while(val%3!=0 && val!=0){
                    val -= 2;
                    noOfOp++;
                }
                noOfOp += noOfOp/3;
            }

            else{
                noOfOp += val/3;
                noOfOp += 1;
            }
        }
        return noOfOp;
    }
}
