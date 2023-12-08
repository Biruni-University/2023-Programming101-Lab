public class Q4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        long seconds = time / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        long remainingHours = hours % 24;
        long remainingMinutes = minutes % 60;
        long remainingSeconds = seconds % 60;
        System.out.println("Current time is " + remainingHours + ":" + remainingMinutes + ":" + remainingSeconds + " GMT");
    }
}
