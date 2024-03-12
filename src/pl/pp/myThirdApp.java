package pl.pp;

import java.util.Scanner;

public class myThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the temperature in Celsius (enter -1 to exit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Exiting program...");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("%.2f Celsius is %.2f Fahrenheit and %.2f Kelvin.\n", celsius, fahrenheit, kelvin);
        }

        scanner.close();
    }
}
