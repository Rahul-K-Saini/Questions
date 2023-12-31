package Others;

import java.util.*;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>();

        // Add elements to the TreeMap
        sortedMap.put("apple", 5);
        sortedMap.put("banana", 2);
        sortedMap.put("orange", 8);

        // Iterate over the entries (in lexicographical order)
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
