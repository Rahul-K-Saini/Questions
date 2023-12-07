package GFG;

import java.util.ArrayList;

public class FirstAndLastOccurences {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(find(arr,7,5));
    }
    static ArrayList<Integer> find(int arr[], int n, int x)
    {

        ArrayList<Integer> ans = new ArrayList<>();
        int index = bs(arr,n,x);
        int first = index;
        int last = index;
        int i = index;
        while(i>0){
            if(arr[--i]==x){
                first = i;
            }
            else break;
        }
        i = index;
        while(i<n-1){
            if(arr[++i]==x){
                last = i;
            }
            else break;
        }
        ans.add(first);
        ans.add(last);
        return ans;

    }
    static int bs(int[] arr, int n, int x){
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == x){
                return m;
            }
            if(arr[m]>x){
                e = m - 1;
            }
            else s =  m + 1;
        }
        return -1;
    }
}
