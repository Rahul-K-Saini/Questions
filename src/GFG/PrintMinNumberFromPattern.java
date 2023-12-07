package GFG;

import java.util.Stack;

public class PrintMinNumberFromPattern {
    public static void main(String[] args) {
        System.out.println(printMinNumberForPattern("D"));
    }
    static String printMinNumberForPattern(String S){
        StringBuilder str = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int n = 1;
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch=='D'){
                st.push(n);
                n++;
            }
            else{
                st.push(n);
                n++;
                while(!st.isEmpty()){
                    str.append(st.pop());
                }
            }
        }
        st.push(n);
        while(!st.isEmpty()){
            str.append(st.pop());
        }

        return str.toString();

    }

}
