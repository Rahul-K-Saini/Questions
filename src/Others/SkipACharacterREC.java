package Others;

public class SkipACharacterREC {
    public static void main(String[] args) {
        String org = "abcdefa";
        String res = "";
        System.out.println(skip(res,org));
    }

    private static String skip(String res, @org.jetbrains.annotations.NotNull String org) {
        if (org.isEmpty()) return res;
        char c = org.charAt(0);
        if (c=='a') return skip(res,org.substring(1));
        else return skip(res+c,org.substring(1));
    }

}
