import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {


    }
        public static int addition(int num1, int num2){
        return num1 + num2;
        }

        public static int subtraction(int num1, int num2){
        return num1 - num2;
        }

        public static int multiplication(int num1, int num2){
        return num1 * num2;
        }

        public static double division(double num1, double num2){
            return num1 / num2;
        }

        public static int modulus(int num1, int num2){
            return num1 % num2;
        }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between 1- 10 ");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input < min || input > max) {
            System.out.println("Input number again");
            return getInteger(min, max - 1);
        } else {
            return input;

        }



    }


    public static long factorial() {
        int userInput = getInteger(1, 10);
        while (true) {
            long factorial = 1;
            for (int i = 1; i <= userInput; i++) {
                factorial = factorial * i;
            }
            System.out.println("Would you like to calculate another factorial? y/n%n");
            String userChoice = new Scanner(System.in).next();
            if (userChoice.equals("n")) {
                break;
            } else {
                factorial();
            }
        }

        return factorial();
    }

    public static int generateRandomNumber(int max){
        return (int) Math.round(Math.random() * max);
    }
    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides do the dice have?");
        byte numberOfSides = scanner.nextByte();
        System.out.printf("Your dice have %d sides.%n", numberOfSides);
        System.out.println("Do you want to roll the dice? y/n");
        String userChoice = scanner.next();
        if (userChoice.equals("y")){
            System.out.println("You rolled the dice!");
            System.out.printf("You rolled %d and %d%n", generateRandomNumber(numberOfSides), generateRandomNumber(numberOfSides));
        }
        System.out.println("Do you want to roll the dice again?");
    }
}








