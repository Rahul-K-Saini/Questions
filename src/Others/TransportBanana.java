package Others;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TransportBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> weights = new ArrayList<>();
        while (scanner.hasNextInt()) {
            weights.add(scanner.nextInt());
        }
        int max_limit = scanner.nextInt();
        int result = minimumVehicles(weights, max_limit);
        System.out.print(result);
    }

    public static int minimumVehicles(List<Integer> weights, int max_limit) {
        List<Integer> placementlelo = new ArrayList<>();
        for (int weight : weights) {
            if (weight != 0) {
                placementlelo.add(weight);
            }
        }
        Collections.sort(placementlelo);
        int left = 0;
        int right = placementlelo.size() - 1;
        int vehicles = 0;
        while (left <= right) {
            if (placementlelo.get(left) + placementlelo.get(right) <= max_limit) {
                left++;
                right--;  // Move right inside the if block
            } else {
                right--;  // Move right inside the else block
            }
            vehicles++;
        }
        return vehicles;
    }

}

