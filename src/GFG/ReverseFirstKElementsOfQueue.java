package GFG;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(modifyQueue(q,3));
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> ans_q = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while(!st.isEmpty())
        {
            ans_q.add(st.pop());
        }
        while(!q.isEmpty()){
            ans_q.add(q.remove());
        }
        return ans_q;
    }

}
