package GFG;

public class MinElementInaRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(findMin(arr,5));
    }
    static int findMin(int[] arr, int n)
    {
        int s = 0;
        int e = n-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(arr[m]<arr[m+1]){
                e = m;
            }
            else return arr[m+1];
        }
        return -1;
    }
}
