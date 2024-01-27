package Others;

import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        System.out.println(findAllIndex(new int[]{2,3,2,2,3,4},2,0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}
