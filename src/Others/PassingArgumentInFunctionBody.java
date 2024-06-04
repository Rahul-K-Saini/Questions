package Others;

import java.util.ArrayList;

public class PassingArgumentInFunctionBody {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5};
        System.out.println(linearSearch(arr,4,0));
    }
    static ArrayList<Integer> linearSearch(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = linearSearch(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;

    }
}
