package LeetCode;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int i=1;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek()==ch){
                    st.pop();
                }
                else st.push(ch);
            }
            else st.push(ch);
            i++;
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()) str.insert(0,st.pop());
        return str.toString();
    }
}
