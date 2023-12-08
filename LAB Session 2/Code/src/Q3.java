import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a 5-digit password:");
        int password = scanner.nextInt();

        // Split the password into individual digits
        int firstDigit = (password / 10000) % 10;
        int secondDigit = (password / 1000) % 10;
        int thirdDigit = (password / 100) % 10;
        int fourthDigit = (password / 10) % 10;
        int fifthDigit = password % 10;

        System.out.println("firstDigit: " + firstDigit);
        System.out.println("secondDigit: " + secondDigit);
        System.out.println("thirdDigit: " + thirdDigit);
        System.out.println("fourthDigit: " + fourthDigit);
        System.out.println("fifthDigit: " + fifthDigit);

        // "Move" each digit by a random number between 0 and 9
        firstDigit = (firstDigit + random.nextInt(10)) % 10;
        secondDigit = (secondDigit + random.nextInt(10)) % 10;
        thirdDigit = (thirdDigit + random.nextInt(10)) % 10;
        fourthDigit = (fourthDigit + random.nextInt(10)) % 10;
        fifthDigit = (fifthDigit + random.nextInt(10)) % 10;

        // Combine the digits back into a new password
        int newPassword = firstDigit * 10000 + secondDigit * 1000 + thirdDigit * 100 + fourthDigit * 10 + fifthDigit;

        System.out.println("The new password is: " + newPassword);
        scanner.close();
    }
}