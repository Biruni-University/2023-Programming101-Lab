import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("2 doubles: ");
        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        double D = sc.nextDouble();
        double E = L * (Math.sin(Math.acos(Math.toRadians(D))));
        System.out.println("Energy = " + E);
        sc.close();
    }
}
