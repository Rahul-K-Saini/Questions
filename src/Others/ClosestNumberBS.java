 package Others;

public class ClosestNumberBS {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        System.out.println(closest(arr,5));
    }
    static int closest(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                e = mid -1;
            }
            else {
                s = mid + 1;
            }
        }
        return arr[e];
    }
}
