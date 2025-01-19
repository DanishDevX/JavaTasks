import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Define the conversion rate
        double conversionRate = 280.71; // 1 Dollar = 280.71 Rupees (example rate)

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value in Dollars
        System.out.print("Enter the value in Dollars: ");
        double dollars = scanner.nextDouble();

        // Convert to Rupees
        double rupees = dollars * conversionRate;

        // Display the result
        System.out.println("Value in Rupees: " + rupees);
    }
}