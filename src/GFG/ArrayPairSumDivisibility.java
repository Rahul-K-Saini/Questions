package GFG;

public class ArrayPairSumDivisibility {
    public static void main(String[] args) {
        int[] arr = {9,5,7,2};
        System.out.println(canPair(arr,6));
    }
    public static boolean canPair(int[] nums, int k) {

        if(nums.length%2==1)    return false;

        int[] arr = new int[k];

        for(int i : nums)   arr[i%k]++;

        int low=1, high=k-1;
        while(low<=high){

            if(arr[low] != arr[high]) return false;

            low++;
            high--;
        }

        return true;
    }
}
