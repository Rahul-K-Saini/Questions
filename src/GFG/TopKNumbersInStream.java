package GFG;

import java.util.ArrayList;
import java.util.HashMap;

public class TopKNumbersInStream {
    public static void main(String[] args) {
        int N = 5, K = 4;
        int[] arr = {5, 2, 1, 3, 2};
        System.out.println(kTop(arr, N, K));
    }

    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int N, int K) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            int x= arr[i];
            ArrayList<Integer> r = new ArrayList<Integer>();
            if(i==0){
                map.put(arr[i],1);
                r.add(arr[i]);
            }else{
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);

                }else{
                    map.put(arr[i],1);
                }
                int c=0;
                for(int j=0;j<result.get(i-1).size();j++){
                    if(x==result.get(i-1).get(j)){
                        continue;
                    }
                    if(c==K){
                        break;
                    }else{
                        if(map.get(result.get(i-1).get(j))>map.get(arr[i])){
                            r.add(result.get(i-1).get(j));
                        }else if(map.get(result.get(i-1).get(j)) == map.get(arr[i])){
                            if(result.get(i-1).get(j) < arr[i]){
                                r.add(result.get(i-1).get(j));
                            }else{
                                r.add(arr[i]);
                                arr[i]=result.get(i-1).get(j);
                            }
                        }else{
                            r.add(arr[i]);
                            arr[i]=result.get(i-1).get(j);
                        }
                    }
                    c++;
                }
                if(c<K){
                    r.add(arr[i]);
                }
            }
            result.add(r);
        }
        return result;
    }
}
