package Others;

import java.util.HashSet;
import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] socks = new String[n];
        for (int i = 0; i < n; i++) {
            socks[i] = sc.nextLine();
        }

        System.out.println(matchSocks(socks));

    }

    public static int matchSocks(String[] socks) {

        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        for (String sock : socks) {
            char num = sock.charAt(0);
            char leg = sock.charAt(1);
            if (leg == 'L') {
                if (set.contains(num + "" + 'R')) {
                    cnt++;
                }
                set.add(sock);
            } else if (leg == 'R') {
                if (set.contains(num + "" + 'L')) {
                    cnt++;
                }
                set.add(sock);
            }
        }
        return cnt;
    }
}


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            String str = sc.nextLine();
//            String[] strs = str.split(" ");
//            for (int j = 0; j < strs.length; j++) {
//                arr[i][j] = Integer.parseInt(strs[j]);
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
