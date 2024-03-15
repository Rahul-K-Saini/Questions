package Others;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,8,2,1};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){
                e = m;
            }
            else s = m +1;
        }
        return e;
    }
}
