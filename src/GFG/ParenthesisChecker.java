package GFG;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String input = "[({[([{}])]})]";
        System.out.println(ispar(input));
    }
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<>();
        st.push(x.charAt(0));
        int i =1;
        while (i<x.length()){
            char c = x.charAt(i);
            if (!st.isEmpty()){
                char st_c = st.peek();
                if (st_c=='(' && c == ')'){
                    st.pop();
                }
                else if (st_c=='{' && c == '}'){
                    st.pop();
                }
                else if (st_c=='[' && c == ']'){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else {
                st.push(c);
            }
            i++;
            System.out.println(st);
        }
        return st.size()==0;
    }
}
