package Others;

public class PrintAllSubsequencesOfString {
    public static void main(String[] args) {
        subsequences("rahul","");
    }
    static void subsequences(String str, String up){
        if(str.isEmpty()){
            System.out.println(up);
            return;
        }
        char c = str.charAt(0);

        subsequences(str.substring(1),up+c);
        subsequences(str.substring(1),up);
    }
}
