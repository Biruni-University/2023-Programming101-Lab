import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        // Declare a double variable with a fractional part
        double doubleValue = sc.nextDouble();

        // Print the original double value
        System.out.println("Original double value: " + doubleValue);

        // Cast the double to an int
        int intValue = (int) doubleValue;

        // Print the resulting int after casting
        System.out.println("Value after casting to int: " + intValue);

        // Demonstrating the precision loss
        System.out.println("Precision loss: " + (doubleValue - intValue));
        sc.close();
    }
}
