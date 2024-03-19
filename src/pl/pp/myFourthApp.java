package pl.pp;

import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = readOption(scanner);

            if (choice == 5) {
                System.out.println("Terminating...");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = readDouble(scanner);
            System.out.print("Enter the second number: ");
            double num2 = readDouble(scanner);

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero. Please choose again.");
                        continue;
                    }
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        scanner.close();
    }

    private static int readOption(Scanner scanner) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
            } else {
                int option = scanner.nextInt();
                if (option >= 1 && option <= 5) {
                    return option;
                } else {
                    System.out.println("Invalid option. Please choose again.");
                }
            }
        }
    }

    private static double readDouble(Scanner scanner) {
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
            } else {
                return scanner.nextDouble();
            }
        }
    }
}
