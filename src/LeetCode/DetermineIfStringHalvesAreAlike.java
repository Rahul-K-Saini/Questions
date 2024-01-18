package LeetCode;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("Uo"));
    }
    public static boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        String oneHalf = str.substring(0,str.length()/2);
        int c1 = 0;
        for(int i=0; i<oneHalf.length(); i++){
            switch(oneHalf.charAt(i)){
                case 'a','e','i','o','u' -> c1++;
            }
        }
        int c2 = 0;
        for(int i=str.length()/2; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'a','e','i','o','u' -> c2++;
            }
        }
        return c1==c2;
    }
}
