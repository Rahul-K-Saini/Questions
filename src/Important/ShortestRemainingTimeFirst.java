package Important;

import java.util.ArrayList;
import java.util.HashMap;

public class ShortestRemainingTimeFirst {
    public static void main(String[] args) {
        int[] arrivalTime = {3, 5, 2, 6};
        int[] burstTime = {2, 3, 6, 4};
        System.out.println(srtf(arrivalTime, burstTime));
    }

    private static ArrayList<String> srtf(int[] arrivalTime, int[] burstTime) {
        HashMap<Integer, String> names = new HashMap<>();
        int[] gantt = new int[100];
        ArrayList<String> completionOrder = new ArrayList<>();
        ArrayList<Integer> completionTime = new ArrayList<>();
        int currentTime = 0;
        int processesRemaining = arrivalTime.length;

        // naam rakh dete hain
        for (int i = 0; i < arrivalTime.length; i++) {
            names.put(i, "p" + i);
        }

        // jab tak sab 0 na ho jayen
        while (processesRemaining > 0) {
            // mujhe min burst time ki process chaiye use hi dundhta hun phle current timr pe
            int minBurstTime = Integer.MAX_VALUE;
            int indexOfMin = -1;

            // yahan vahi kaam chl rha hai
            for (int j = 0; j < arrivalTime.length; j++) {
                if (arrivalTime[j] <= currentTime && burstTime[j] < minBurstTime && burstTime[j] > 0) {
                    minBurstTime = burstTime[j];
                    indexOfMin = j;
                }
            }
            // agar current time pe koi aaayi hi nhi agle time pe dhundo
            if (indexOfMin == -1) {
                // No process can be executed at the current time, move to the next arrival time
                currentTime++;

            }

            else {
                // uski ek sec ghta do
                burstTime[indexOfMin]--;
                // gantt pe daal do use
                gantt[currentTime] = indexOfMin;

                // ab next ek sec badhe hue time pe dekho koi or to nhi aagya chota
                currentTime++;

                // or agar ye khatam ho gyi to suhaha
                if (burstTime[indexOfMin] == 0) {
                    // Process completed
                    processesRemaining--; // ek to kahatam
                    completionOrder.add(names.get(indexOfMin));
                    completionTime.add(currentTime);
                }
            }
        }
        System.out.println(completionTime);
        return completionOrder;
    }
}
