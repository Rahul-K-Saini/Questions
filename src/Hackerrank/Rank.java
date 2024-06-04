package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Rank {
    public static void main(String[] args) {
        int[] ranked = {100,100,50,40,40,20,10};
        int[] player = {5,25,50,120};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int n:ranked) list1.add(n);
        for (int n:player) list2.add(n);
        System.out.println(climbingLeaderboard(list1,list2));
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        for (int i = 0; i < ranked.size()-1; i++) {
            if (ranked.get(i)== ranked.get(i+1))
                ranked.remove(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int n:player){
            boolean flag = false;
            for(int i=0; i<ranked.size(); i++){
                if(n>=ranked.get(i)){
                    ans.add(i+1);
                    flag = true;
                    break;
                }

            }
            if (!flag){
                ans.add(ranked.size()+1);
            }

        }
        return ans;

    }


}
