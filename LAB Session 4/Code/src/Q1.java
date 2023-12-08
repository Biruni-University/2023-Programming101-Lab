import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start: ");
        String startPoint = scanner.nextLine();
        System.out.println("destination: ");
        String destination = scanner.nextLine();
        System.out.println("hasCargo: ");
        boolean hasCargo = scanner.nextBoolean();
        System.out.println("distance: ");
        double distance = scanner.nextDouble();
        scanner.nextLine(); // Consume the remaining newline
        double cargoWeight = 0;
        double costPerKm = 25;
        double costPerKg = 35;

        // If interplanetary transport, add 10^10 km to the distance
        if (!startPoint.equals(destination)) {
            distance += 1e10;
        }

        // If there is cargo, read its weight
        if (hasCargo) {
            System.out.println("cargoWeight: ");
            cargoWeight = Double.parseDouble(scanner.nextLine());
        }

        double cost = (distance * costPerKm) + (cargoWeight * costPerKg);
        System.out.println("Total transport cost: $" + cost);
    }
}