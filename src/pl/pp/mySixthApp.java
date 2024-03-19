import java.util.Scanner;

public class mySixthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        scanner.close();

        long startTimeIterative = System.nanoTime();
        long factorialIterative = factorialIterative(n);
        long endTimeIterative = System.nanoTime();
        long executionTimeIterative = (endTimeIterative - startTimeIterative) / 1000000;

        long startTimeRecursive = System.nanoTime();
        long factorialRecursive = factorialRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long executionTimeRecursive = (endTimeRecursive - startTimeRecursive) / 1000000;

        System.out.println("Factorial (iterative) of " + n + " is: " + factorialIterative);
        System.out.println("Execution time (iterative): " + executionTimeIterative + "ms");

        System.out.println("\nFactorial (recursive) of " + n + " is: " + factorialRecursive);
        System.out.println("Execution time (recursive): " + executionTimeRecursive + "ms");
    }

    public static long factorialIterative(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) factorial *= i;
        return factorial;
    }

    public static long factorialRecursive(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorialRecursive(n - 1);
    }
}
