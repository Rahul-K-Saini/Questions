package LeetCode;

public class FrogJumpsLC403 {
    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6,8,12,17};
        System.out.println(canCross(arr,1,1));
    }
    public static boolean canCross(int[] stones,int n,int index) {
        if (index>= stones.length-1){
            return true;
        }
        if (index<= stones.length-1) return false;
       index += n;
       n = index;
       boolean first = canCross(stones,n,index);
       index+=n+1;
       n = index;
       boolean sec = canCross(stones,n,index);
       index += n-1;
       n = index;
       boolean third = canCross(stones,n,index);
       return  first || sec || third;
    }
}
