import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Age: ");
        int age = input.nextInt();
        System.out.println("income: ");
        double annualIncome = input.nextDouble();
        System.out.println("employed or unemployed: ");
        String employmentStatus = input.next();
        System.out.println("Enter your existing debt: ");
        double existingDebt = input.nextDouble();
        double creditScore = 0;
        if (age >= 18 && age <= 25) {
            creditScore += 5;
        } else if (age >= 26 && age <= 35) {
            creditScore += 10;
        } else if (age >= 36 && age <= 45) {
            creditScore += 15;
        } else if (age >= 46 && age <= 55) {
            creditScore += 20;
        } else if (age >= 56 && age <= 65) {
            creditScore += 10;
        } else if (age > 65) {
            creditScore += 5;
        }
        if (annualIncome >= 100000) {
            creditScore += 20;
        } else if (annualIncome >= 80000 && annualIncome < 100000) {
            creditScore += 15;
        } else if (annualIncome >= 60000 && annualIncome < 80000) {
            creditScore += 10;
        } else if (annualIncome >= 40000 && annualIncome < 60000) {
            creditScore += 5;
        }
        switch (employmentStatus) {
            case "employed": {
                creditScore += 10;
                break;
            }
            case "unemployed":  {
                creditScore -= 5;
                break;
            }
            default: {
                System.out.println("Invalid input");
                break;
            }
        }
        if (existingDebt > 0) {
            creditScore -= 5;
        }
        if (creditScore >= 40) {
            System.out.println("Your credit score is: " + creditScore + " and you are eligible for a loan.");
        } else {
            System.out.println("Your credit score is: " + creditScore + " and you are not eligible for a loan.");
        }
    }
}
