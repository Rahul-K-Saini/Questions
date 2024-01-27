package GFG;

public class RemoveAdjacnet {
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println("The string is "+rremove(s));

    }
    static String rremove(String s) {
        return removeAdjacent(s,"");
    }
    static String removeAdjacent(String s, String str){
        for (int i = 0; i < s.length(); i++) {
            if (i==0){
                if(s.charAt(i)!=s.charAt(i+1)) str+=s.charAt(i);
            }
            else if(i==s.length()-1){
                if(s.charAt(i)!=s.charAt(i-1)) str+=s.charAt(i);
            }
            else {
                if (s.charAt(i) != s.charAt(i+1) && s.charAt(i) !=s.charAt(i-1)){
                    str += s.charAt(i);
                }
            }

        }
        if(s.length() == str.length()){
            return s;
        }
        return removeAdjacent(str,"");
    }

}
