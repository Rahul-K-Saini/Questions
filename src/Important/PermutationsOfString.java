package Important;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    public static void main(String[] args) {
        System.out.println(find_permutation("abc"));

    }
    static List<String> ans = new ArrayList<>();
    public static List<String> find_permutation(String S) {
        String p = "";
        solve(S,p);
        return ans;
    }
    static void solve(String up,String p){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        char c = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            solve(up.substring(1),f+c+s);
        }
    }
}
