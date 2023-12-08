import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the key (integer):");
        int key = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        System.out.println("Enter a character to encrypt:");
        char character = (char) scanner.nextByte();

        // Encrypt
        char encryptedChar = (char)(character ^ key);
        System.out.println("Encrypted character: " + encryptedChar);

        // Decrypt
        char decryptedChar = (char)(encryptedChar ^ key);
        System.out.println("Decrypted character: " + decryptedChar);
    }
}
