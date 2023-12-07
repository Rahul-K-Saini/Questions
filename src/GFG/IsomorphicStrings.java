package GFG;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(areIsomorphic("abb","xxz"));
    }
    public static boolean areIsomorphic(String S1,String S2)
    {
        if(S1.length()!=S2.length()) return false;
        Pairs[] list = new Pairs[1000];
        for(int i=0; i<S1.length(); i++){
            char ch1 = S1.charAt(i);
            char ch2 = S2.charAt(i);
            Pairs obj = new Pairs(ch1,ch2);
            list[i] = obj;
            for(int j=0; j<i+1; j++){
                if(list[j].ch1 == ch1){
                    if(list[j].ch2 != ch2){
                        return false;
                    }
                }

            }
        }
        return true;

    }

}

class Pairs{
    char ch1;
    char ch2;
    Pairs(char ch1, char ch2){
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
}

