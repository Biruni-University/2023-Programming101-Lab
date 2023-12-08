import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Process instruction
        String color = scanner.nextLine();
        String direction = scanner.nextLine();
        if (color.equals("green")) {
            System.out.println("Go " + direction);
        } else if (color.equals("yellow")) {
            if (direction.equals("right")) {
                System.out.println("Slow down and turn right if safe");
            } else { // Assuming direction is left
                System.out.println("Slow down and turn left if safe");
            }
        } else if (color.equals("red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid instruction");
        }
    }
}
