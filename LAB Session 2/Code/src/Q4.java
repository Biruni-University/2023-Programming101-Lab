import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive number X: ");
        double x = scanner.nextDouble();

        // Generate a random number R between 0 and X
        double r = Math.random() * x;
        System.out.println("Random number R: " + r);

        // Calculate properties of the equilateral triangle
        double triangleArea = (Math.sqrt(3) / 4) * (r * r);
        double trianglePerimeter = 3 * r;

        // Calculate properties of the circle
        double circleArea = Math.PI * (r * r);
        double circleCircumference = 2 * Math.PI * r;

        // Calculate properties of the square
        double squareArea = r * r;
        double squarePerimeter = 4 * r;

        // Print the results
        System.out.println("Equilateral Triangle: ");
        System.out.println(" - Area: " + triangleArea);
        System.out.println(" - Perimeter: " + trianglePerimeter);

        System.out.println("Circle: ");
        System.out.println(" - Area: " + circleArea);
        System.out.println(" - Circumference: " + circleCircumference);

        System.out.println("Square: ");
        System.out.println(" - Area: " + squareArea);
        System.out.println(" - Perimeter: " + squarePerimeter);

        scanner.close();
    }
}