package GFG;

public class AreRotations {
    public static void main(String[] args) {
        String s1 = "mightandmagic";
        String s2 =  "andmagicmigth";
        System.out.println(areRotations(s1,s2));
    }
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length()!=s2.length()) return false;
        String concat = s1+s2;
        for(int i=0; i<(concat.length()-s1.length()); i++){
            String str = concat.substring(i,s1.length()+i);
            if((str).equals(s2)) return true;
        }
        return false;
    }
}
