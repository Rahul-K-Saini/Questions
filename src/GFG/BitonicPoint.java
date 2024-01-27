package GFG;

public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 0};
        System.out.println(findMaximum(arr, 4));
    }
    static int findMaximum(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            } else if (mid > 0 && arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
