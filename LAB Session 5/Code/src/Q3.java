import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice (1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for Division): ");
        String choice = input.nextLine();
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        switch (choice) {
            case "1":{
                System.out.println("The result is: " + (num1 + num2));
                break;
            }
            case "2":{
                System.out.println("The result is: " + (num1 - num2));
                break;
            }
            case "3":{
                System.out.println("The result is: " + (num1 * num2));
                break;
            }
            case "4": {
                if (num2 == 0) {
                    System.out.println("Division by zero is not possible.");
                } else {
                    System.out.println("The result is: " + (num1 / num2));
                }
                break;
            }
        }
    }
}
