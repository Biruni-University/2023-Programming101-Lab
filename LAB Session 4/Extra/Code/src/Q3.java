import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character to check if it's an uppercase alphabet letter:");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch) && Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase alphabet letter.");
        } else {
            System.out.println(ch + " is not an uppercase alphabet letter.");
        }
    }
}

