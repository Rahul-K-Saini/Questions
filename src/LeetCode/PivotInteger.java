package LeetCode;

public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(1));
    }
    public static int pivotInteger(int n) {
        int i=1,j=n;
        int sumi = i;
        int sumj=j;
        while(i<=j){

            if(sumi==sumj){
                if(i==j) return i;
                i++;
                j--;
                sumi+=i;
                sumj+=j;
            }
            else if(sumi<sumj){
                i++;
                sumi+=i;
            }
            else{
                j--;
                sumj+=j;
            }
        }
        return -1;
    }
}

