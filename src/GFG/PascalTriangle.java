package GFG;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(nthRowOfPascalTriangle(100));
    }
    static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<ArrayList<Long>> arr = new ArrayList<>();
        ArrayList<Long> firstRow = new ArrayList<>();
        firstRow.add((long)1);
        ArrayList<Long> secondRow = new ArrayList<>();
        secondRow.add((long)1);
        secondRow.add((long)1);
        arr.add(firstRow);
        arr.add(secondRow);
        for(int i=2; i<n; i++){
            ArrayList<Long> list = new ArrayList<>();
            ArrayList<Long> previous = arr.get(i-1);
            list.add((long)1);
            for(int j=1; j<i; j++){
                long val = (previous.get(j-1)+previous.get(j))%1000000007;
                list.add(val);
            }
            list.add((long)1);
            arr.add(list);
        }
        return arr.get(n-1);
    }
}
