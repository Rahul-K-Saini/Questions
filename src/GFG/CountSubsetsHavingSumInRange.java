package GFG;

public class CountSubsetsHavingSumInRange {
    public static void main(String[] args) {
        System.out.println(countSubsets(3,new int[]{-1,1,0},0,3));
    }
    static long cnt;
    public static void helper(int n,int indx,int sum,int []arr,int l,int r){
        if(indx==n){
            if(sum>=l && sum<=r)cnt++;
            return;
        }
        helper(n,indx+1,sum+arr[indx],arr,l,r);
        helper(n,indx+1,sum,arr,l,r);
    }
    public static long countSubsets(int n, int[] arr, int l, int r) {
        cnt =0;
        helper(n,0,0,arr,l,r);
        return cnt;
    }
}
