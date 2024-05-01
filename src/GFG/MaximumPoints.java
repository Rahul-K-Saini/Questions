package GFG;

public class MaximumPoints {
    public static void main(String[] args) {

        System.out.println(maxPoints(5 ,new int[][]{{3,8},{7,2},{5,3},{4,3},{3,2},{7,9}}));

    }
    public static long maxPoints(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int num = arr[i][0];
            int increment = arr[i][1];
            for(int j=i+increment+1; j<n; j+=increment+1){
                num+=arr[j][0];
            }
            max = Math.max(num,max);
        }
        return max;
    }
}
