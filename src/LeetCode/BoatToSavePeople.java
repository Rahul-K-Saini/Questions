package LeetCode;

import java.util.Arrays;

public class BoatToSavePeople {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        System.out.println(numRescueBoats(people,3));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int boat = 0;
        while(i<=j){
            if(i==j){
                if(people[i]<=limit){
                    boat++;
                    return boat;
                }
            }
            if(people[i]+people[j]<=limit){
                boat++;
                i++;
                j--;
            }
            else {
                boat++;
                j--;
            }
        }
        return boat;
    }
}
