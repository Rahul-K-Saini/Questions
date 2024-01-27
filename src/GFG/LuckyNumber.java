package GFG;

import java.util.ArrayList;

public class LuckyNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isLucky3(n));
    }
    public static boolean isLucky2(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i = 1;
        while(i<list.size()){
            for (int j = i; j<n; j+=i) {
                if (j>=list.size()) break;
                list.remove(j);
            }
            i++;
        }
        return list.contains(n);
    }

    public static boolean isLucky(int n) {

        return isLuckyNumber(n, 2);
    }

    public static boolean isLuckyNumber(int n, int k) {
        if (n%k == 0) {
            return false;
        }
        if (k > n) {
            return true;
        }
        return isLuckyNumber(n-n/k, k+1);
    }

    static boolean isLucky3(int n) {
        for(int i=2;i<=n;i++){
            if(n%i==0){
                return false;
            }
            n=n-(n/i);
        }
        return true;
    }
}