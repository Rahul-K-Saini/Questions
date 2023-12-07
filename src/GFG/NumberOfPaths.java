package GFG;
// Not very Efficient may cause TLE in various coding platform
import java.util.Scanner;

public class NumberOfPaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(numberOfPaths(m,n));
    }
    static long numberOfPaths(int M, int N) {
        if(M==1 || N == 1){
            return 1;
        }

        long right = numberOfPaths(M-1,N);
        long left = numberOfPaths(M,N-1);
        return right+left;
    }

}

