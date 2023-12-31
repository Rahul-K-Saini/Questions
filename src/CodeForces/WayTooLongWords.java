package CodeForces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine();
        }
        shortWords(n, arr);
    }


    private static void shortWords(int n,String[] arr) {

        for (int i = 0; i < n; i++) {
            String ans = "";
            if(arr[i].length()<10) {
                ans += arr[i];
                System.out.println(ans);
                continue;
            }
            ans += arr[i].charAt(0);
            ans += arr[i].length() - 2;
            ans += arr[i].charAt(arr[i].length()-1);
            System.out.println(ans);
        }
    }
}
