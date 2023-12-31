package LeetCode;

import java.util.ArrayList;

public class DestinationCity {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        // Create and add the inner ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("qMTSlfgZlC");
        list1.add("ePvzZaqLXj");
        listOfLists.add(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("xKhZXfuBeC");
        list2.add("TtnllZpKKg");
        listOfLists.add(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("ePvzZaqLXj");
        list3.add("sxrvXFcqgG");
        listOfLists.add(list3);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("sxrvXFcqgG");
        list4.add("xKhZXfuBeC");
        listOfLists.add(list4);

        ArrayList<String> list5 = new ArrayList<>();
        list5.add("TtnllZpKKg");
        list5.add("OAxMijOZgW");
        listOfLists.add(list5);
        System.out.println(destCity(listOfLists));

    }
    public static String destCity(ArrayList<ArrayList<String>> path) {
        String destination = path.get(0).get(1);
        for(int i=1; i<path.size(); i++){
            String str = path.get(i).get(0);
            if(str.equals(destination)){
                destination = path.get(i).get(1);
            }

        }
        return destination;

    }
}
