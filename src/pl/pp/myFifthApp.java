package pl.pp;
import java.util.Scanner;

public class myFifthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type the character you want to print: ");
        char character = scanner.next().charAt(0);
        System.out.print("indicate how many times you want to print each character in a row: ");
        int timesPerRow = scanner.nextInt();
        System.out.print("indicate how many rows you want to print: ");
        int numberOfRows = scanner.nextInt();
        scanner.close();

        printCharacter(character, timesPerRow, numberOfRows);
    }

    private static void printCharacter(char character, int timesPerRow, int numberOfRows) {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < timesPerRow; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
