import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        System.out.print("Please enter a floating-point number: ");

        number = scanner.nextDouble();

        // Using Math.rint to round to the nearest whole number
        double rintResult = Math.rint(number);
        // Using Math.round to round to the nearest whole number
        long roundResult = Math.round(number);

        System.out.println("\nUsing Math.rint: " + rintResult);
        System.out.println("Using Math.round: " + roundResult);

        // Explanation of the difference between Math.rint and Math.round
        System.out.println("\nExplanation:");
        System.out.println("Math.rint() rounds to the nearest even whole number when the decimal is .5, which is " + rintResult + " in this case.");
        System.out.println("Math.round() rounds up to the nearest whole number when the decimal is .5 or greater, which results in " + roundResult + ".");

        scanner.close();
    }
}
