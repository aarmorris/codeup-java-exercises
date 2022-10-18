package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.println("Enter input y/n:");
        String userInput = scanner.nextLine();
        if (userInput.equals("y") || userInput.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }


    public int getInt() {
        System.out.println("Enter number of your choice:");
        return scanner.nextInt();
    }


    public int getInteger(int min, int max) {
        System.out.print("Enter a number between 1- 85: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input < min || input > max) {
            System.out.println("That number is out of range please re-enter.");
            return getInteger(min, max - 1);
        } else {
            return input;

        }
    }


    public double getDouble(double min, double max) {
        System.out.print("Enter a number with a decimal:");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input < min || input > max) {
            System.out.println("That number is out of range please re-enter.");
            return getDouble(min, max);
        } else {
            return input;
        }
    }

    public Input() {
        scanner = new Scanner(System.in);
    }

}