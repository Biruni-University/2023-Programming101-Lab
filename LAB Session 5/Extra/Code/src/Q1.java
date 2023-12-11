import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = input.nextInt();
        if (temp < 10) {
            System.out.println("Cold");
        } else if (temp >= 10 && temp <= 25) {
            System.out.println("Mild");
        } else {
            System.out.println("Hot");
        }
    }
}
