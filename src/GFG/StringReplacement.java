package GFG;
// wrong
public class StringReplacement {
    public static int countOperations(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (i > 0) {
            if (i > 0 && s.charAt(i) == 'b' && s.charAt(i - 1) == 'a') {
                // Remove the "ab" part and add "bba" to the end of the string
                s = s.substring(0, i - 1) + "bba";
                count++;
                // Adjust `i` to the end of the modified string
                i = s.length() - 1;
            } else {
                i--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOperations("abab")); // Example call
    }

}
