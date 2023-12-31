package Others;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ROI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Stock> stocks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            stocks.add(new Stock(a, b, c));
        }
        int m = scanner.nextInt();
        int x = 0;
        int y = 0;
        List<List<Integer>> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arr.add(scanner.nextInt());
            }
            array.add(arr);
        }
        int day = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Stock stock = stocks.get(i);
            int a = stock.getA();
            int b = stock.getB();
            int c = stock.getC();
            if (b > day) {
                continue;
            } else if (c > day || c == 0) {
                y += a * (array.get(i).get(day - 1) - array.get(i).get(b - 1));
            } else {
                x += a * (array.get(i).get(c - 1) - array.get(i).get(b - 1));
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}

class Stock {
    private int a;
    private int b;
    private int c;

    public Stock(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}

