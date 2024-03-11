package pl.pp;
import java.util.Scanner;
public class mySecondApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age in years
        System.out.print("Enter your age in years: ");

        // Read the age input from the user
        int ageInYears = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the age in seconds (1 year = 365.25 days, 1 day = 24 hours, 1 hour = 3600 seconds)
        long ageInSeconds = (long) ageInYears * 365 * 24 * 3600;

        // Display the age in seconds with proper description
        System.out.println("Your age in seconds: " + ageInSeconds);
        }
    }
