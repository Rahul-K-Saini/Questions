package GFG;

import java.util.ArrayList;

public class FairyTailContest {
    public static void main(String[] args) {
        System.out.println(lastFairyStanding(5,2));
    }
    public static int lastFairyStanding(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        int idx = 0;
        while(list.size()!=1){
            idx += k;
            list.remove((idx-1)% list.size());
        }
        return list.get(0);
    }
}
