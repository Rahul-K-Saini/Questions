package GFG;
import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "V";
        System.out.println(romanToDecimal(s));
    }
    static public int romanToDecimal(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        HashMap<Character,Integer> priority = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        priority.put('I',0);
        priority.put('V',1);
        priority.put('X',2);
        priority.put('L',3);
        priority.put('C',4);
        priority.put('D',5);
        priority.put('M',6);
        int ans = map.get(str.charAt(0));
        st.push(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            while(!st.isEmpty() && priority.get(st.peek())<priority.get(ch)){
                ans -= 2*map.get(st.pop());

            }
            ans += map.get(ch);
            st.push(ch);

        }
        return ans;

    }
}
