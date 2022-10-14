import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(subtraction(50, 25));

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

        public static int division(int num1, int num2){
            return num1 / num2;
        }

        public static int modulus(int num1, int num2){
            return num1 % num2;
        }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between 1- 10");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input < min || input > max) {
            System.out.println("Input number again");
            return getInteger(min, max - 1);
        } else {
            return input;
        }

    }
}




