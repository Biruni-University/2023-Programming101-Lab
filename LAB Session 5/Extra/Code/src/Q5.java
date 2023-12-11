import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0;
        System.out.println("Enter the travel class (economy, business, first class): ");
        String travelClass = input.nextLine();
        System.out.println("Enter the season (peak season or off-season): ");
        String season = input.nextLine();
        switch (travelClass) {
            case "economy" : {
                switch (season) {
                    case "peak season" : { price = 500; break; }
                    case "off-season" : { price = 300; break; }
                }
		        break;
            }
            case "business" : {
                switch (season) {
                    case "peak season" : { price = 800; break; }
                    case "off-season" : { price = 600; break; }
                }
		        break;
            }
            case "first class" : {
                switch (season) {
                    case "peak season" : { price = 1100; break; }
                    case "off-season" : { price = 900; break; }
                }
		        break;
            }
        }
        System.out.println("The price of the flight ticket is: " + price);

    }    
}
