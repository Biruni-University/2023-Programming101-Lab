import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your role: ");
        String role = input.nextLine();

        switch (role) {
            case "Admin":
                System.out.println("Full permission");
                break;
            case "Editor":
                System.out.println("Update information");
                break;
            case "Viewer":
                System.out.println("Read-Only");
                break;
            default:
                System.out.println("Unknown role");
        }
    }

}
