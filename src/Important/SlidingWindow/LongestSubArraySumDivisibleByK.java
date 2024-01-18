package Important.SlidingWindow;

import java.util.HashMap;

public class LongestSubArraySumDivisibleByK {
    public static void main(String[] args) {
        int[] a = {-9,0,0,0,9};
        int k = 4;
        System.out.println(longestSubArrayWithSumDivByK(a,a.length,k));
    }
        static int longestSubArrayWithSumDivByK(int[] a, int n, int k)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            long sum = 0;
            int ans = 0;
            map.put(0,-1);
            for(int i=0; i<n; i++){
                sum += a[i];
                int rem = (int)(sum%k);
                if(rem<0){
                    rem = rem + k;
                }
                if(!map.containsKey(rem)){
                    map.put(rem,i);
                }
                else{
                    ans = Math.max(i - map.get(rem),ans);
                }
            }
            return ans;
        }

    }


