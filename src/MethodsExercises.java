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

        public static int division(int num1, int num2){
            return num1 / num2;
        }

        public static int modulus(int num1, int num2){
            return num1 % num2;
        }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > max || input < min){
            System.out.printf("Invalid number! Enter a number between %s to %s:", min, max);
            return getInteger(min, max);
        }
        System.out.printf("You entered %s!", input);
        return input;
    }
}




