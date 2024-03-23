package Others;


public class Seive {
    public static void main(String[] args) {
        boolean[] ans = seiveOfErostheses();
        for (int i = 2; i < ans.length; i++) {
            if (!ans[i]) System.out.println(i);
        }
    }

    static boolean[] seiveOfErostheses() {
        boolean[] primes = new boolean[50 + 1];
        for (int i = 2; i * i <= 50; i++) {
            if (!primes[i]) {
                for (int j = i*i; j <= 50; j += i) {
                    primes[j] = true;
                }
            }
        }
        return primes;
    }
}
