package Others;

import java.util.ArrayList;

public class SubsequencesOfString {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        subsequences("abc","");
        System.out.println(list);
    }
    static void subsequences(String org, String res){
        if (org.isEmpty()) {
            if (!res.isEmpty()) list.add(res);
            return;
        }
        char ch = org.charAt(0);
        subsequences(org.substring(1),res+ch);
        subsequences(org.substring(1),res);

    }
}
