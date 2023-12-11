import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the language code (EN for English, TUR for Turkish, DE for German): ");
        String languageCode = input.nextLine();
        switch (languageCode) {
            case "EN":{
                System.out.println("Hello!");
                break;
            }
            case "TUR":{
                System.out.println("Merhaba!");
                break;
            }
            case "DE":{
                System.out.println("Hallo!");
                break;
            }
            default:{
                System.out.println("Unsupported language code.");
                break;
            }
        }
    }
}
