import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String customerType;
        double purchaseAmount;
        boolean isSpecialSale;

        System.out.print("Enter customer type (Regular, Member, VIP): ");
        customerType = input.nextLine();
        System.out.print("Enter purchase amount: ");
        purchaseAmount = input.nextDouble();
        System.out.print("Is there a special sale? (true/false): ");
        isSpecialSale = input.nextBoolean();

        if (isSpecialSale) {
            System.out.println("Eligible for discount");
        } else {
            switch (customerType) {
                case "Regular":
                    if (purchaseAmount >= 1000) {
                        System.out.println("Eligible for discount");
                    } else {
                        System.out.println("Not eligible for discount");
                    }
                    break;
                case "Member":
                    if (purchaseAmount >= 500) {
                        System.out.println("Eligible for discount");
                    } else {
                        System.out.println("Not eligible for discount");
                    }
                    break;
                case "VIP":
                    if (purchaseAmount >= 100) {
                        System.out.println("Eligible for discount");
                    } else {
                        System.out.println("Not eligible for discount");
                    }
                    break;
                default:
                    System.out.println("Not eligible for discount");
            }
        }
    }
}
