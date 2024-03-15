package GFG;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("geEksforGEeks"));

    }
    static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
//        System.out.println(s);
        for(char c:str.toCharArray()){
            if(sb.indexOf(c+"")==-1){
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
