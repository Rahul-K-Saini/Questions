package GFG;

import java.util.ArrayList;

public class SearchPattern {
    public static void main(String[] args) {
        System.out.println(search("birth","birthdayboy"));
    }
    static ArrayList<Integer> search(String pattern, String text)
    {
        int i=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<text.length()-pattern.length()+1){
            if(text.startsWith(pattern, i)){
                ans.add(i+1);
            }
            i++;
        }
        return ans;
    }
}
