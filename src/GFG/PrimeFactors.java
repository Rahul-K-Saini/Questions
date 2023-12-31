package GFG;

import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(primeFactors(378));
    }
    public static ArrayList<Integer> primeFactors(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        while (n % 2 == 0) {
            list.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        if (n > 2)
            list.add(n);

        return list;
    }
}
