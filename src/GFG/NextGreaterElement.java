package GFG;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = {
            6273, 8726, 8726, 9909, 5881, 8305, 1953, 8305, 8305, 9909, 9909, 9916, 5936, 7822, 4961, 7822, 7822,
            8346, 4622, 7708, 2296, 2573, 2185, 2573, 2573, 7708, 7708, 8346, 4702, 7107, 2861, 7107, 7107, 8346,
            2428, 6388, 6388, 6818, 6818, 8346, 33, 8346, 8346, 9528, 3061, 5361, 5361, 6275, 275, 2461, 2461, 6275,
            6275, 8306, 8306, 9528, 2493, 9528, 302, 9528, 9528, 9916, 4165, 7621, 7621, 9916, 6805, 9916, 1371,
            9916, 9916, -1, 3082, 5113, 5113, 6564, 3550, 6564, 6564, 8651, 8651, -1, 5165, 6814, 3823, 6814, 6814,
            8179, 8179, -1, 2902, 4405, 2410, 4405, 1549, 4405, 4405, 5238, 5238, -1
        };
        System.out.println(Arrays.toString(nextLargerElement(arr,100)));
    }

        public static long[] nextLargerElement(long[] arr, int n) {
            Stack<Long> st = new Stack<>();
            long[] ans = new long[n];
            st.push(arr[n - 1]);
            ans[n - 1] = -1;
            for (int i = n - 2; i >= 0; i--) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                    st.push(arr[i]);
                    continue;
                }
                if (st.peek() < arr[i]) {
                    while (!st.isEmpty() && st.peek() < arr[i]) {
                        st.pop();
                    }
                    if (st.isEmpty()) {
                        ans[i] = -1;
                    } else {
                        ans[i] = st.peek();
                    }
                } else {
                    ans[i] = st.peek();
                }
                st.push(arr[i]);
            }
            return ans;
        }

    }


