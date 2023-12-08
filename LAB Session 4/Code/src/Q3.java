import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        int d = scanner.nextInt();
        boolean d2 = ((a & b) & d) == d;
        System.out.println(d2);
    }
}
