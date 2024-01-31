package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DailyTempratures {
    public static void main(String[] args) {
        int[] arr = {30,40,50,60};
        System.out.println(Arrays.toString(dailyTemperatures2(arr)));
    }
    static int[] dailyTemperatures1(int[] temp) {
        int n = temp.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[n];
        ans[n-1] = 0;
        map.put(temp[n-1],n-1);
        for (int i = n-2; i >=0; i--) {
            int val = temp[i];
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = val+1; j <=100 ; j++) {
                if(map.containsKey(j)){
                    index = Math.min(map.get(j),min);
                    min = index;
                }
            }
            if (index==0) ans[i] = index;
            else ans[i] = index-i;
            map.put(temp[i],i);
        }
        return ans;


    }
    // 30,40,50,60
    static int[] dailyTemperatures2(int[] temps) {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}
