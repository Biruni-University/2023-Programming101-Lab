/*
When nextInt() is called, it reads the integer value but does not consume the newline character (\n) that is entered when the user presses Enter.
The subsequent call to nextLine() then reads the remainder of the line which contains only that newline character, resulting in an empty string.
How to Fix It:
To resolve this issue, you can add an extra nextLine() call right after nextInt() to consume the newline character.
This way, the next call to nextLine() will wait for the user to enter the next line of input. Here's the corrected version of the code:
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and then enter a string: ");

        // Reading integer input
        System.out.println("nextInt() = " + sc.nextInt());

        // Consuming the leftover newline character
        sc.nextLine();

        // Reading string input
        System.out.println("nextLine() = " + sc.nextLine());
    }
}

/*
After the nextInt() method reads the integer, the nextLine() immediately following it consumes the newline character left in the input stream.
The final nextLine() then correctly waits for and reads the next line of input as intended.
 */