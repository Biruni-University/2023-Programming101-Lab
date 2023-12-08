public class Q4 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        // Convert current time to hours in GMT
        long totalHours = currentTimeMillis / 1000 / 60 / 60;
        int currentHourGMT = (int) (totalHours % 24);

        if (currentHourGMT >= 12) {
            System.out.println("The current GMT time is after midday.");
        } else {
            System.out.println("The current GMT time is before midday.");
        }
    }
}
