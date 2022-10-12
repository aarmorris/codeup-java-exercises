import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is: %.2f %n", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInteger = scanner.nextInt();
        System.out.printf("Your Number is: %d %n", userInteger);
        String ghost = scanner.nextLine();
        System.out.println("Enter 3 words");

        String oneWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your three words are: %s %n %s %n %s %n", oneWord, secondWord, thirdWord);
        System.out.println("Please enter a sentence");
        String userSentence = scanner.next();
        System.out.printf("Sentence: %s", userSentence);

        System.out.println("Enter the length of classroom:");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the width of your classroom:");
        double width = Double.parseDouble(scanner.nextLine());
        double perimeter = width * 2 + length * 2;
        System.out.printf("The perimeter of your classroom is %.2f%n", perimeter);
        System.out.printf("The volume of your classroom is %.2f cubic feet");









    }
}
