public class Q7 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 1;
        if (a == 0)
            System.out.println("Not a quadratic equation");
        else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0)
                System.out.println("Real and Different");
            else if (discriminant == 0)
                System.out.println("Real and Equal");
            else
                System.out.println("Complex");
        }
    }
}
