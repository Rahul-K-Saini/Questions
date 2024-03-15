package LeetCode;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
       String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token:tokens){
            if(token.equals("/") || token.equals("+") || token.equals("*") || token.equals("-")){
                int b = st.pop();
                int a = st.pop();
                switch(token){
                    case "/"->{
                        st.push(a/b);
                    }
                    case "*"->{
                        st.push(a*b);
                    }
                    case "-"->{
                        st.push(a-b);
                    }
                    case "+"->{
                        st.push(a+b);
                    }

                }
            }
            else st.push(Integer.parseInt(token));

        }
        return st.pop();
    }
}
