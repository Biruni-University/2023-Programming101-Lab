import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in USD: ");
        double amount = input.nextDouble();
        System.out.println("Enter the target currency (EUR, CHF, TRY): ");
        String targetCurrency = input.next();
        switch (targetCurrency) {
            case "EUR":{
                System.out.println("The amount in EUR is: " + (amount * 0.92));
                break;
            }
            case "CHF":{
                System.out.println("The amount in CHF is: " + (amount * 0.87));
                break;
            }
            case "TRY":{
                System.out.println("The amount in TRY is: " + (amount * 28.90));
                break;
            }
        }
    }
}
