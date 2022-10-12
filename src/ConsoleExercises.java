import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class ConsoleExercises {
//
//    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("\n");
//        System.out.println("Enter an integer:");
//        int userInteger = sc.nextInt();
//        System.out.printf("You entered %d%n", userInteger);
//        System.out.println("Enter three words:");
//         String word1, word2, word3;
//         word1 = sc.next();
//        String word1 = sc.nextLine();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        String word1 = sc.next(), word2 = sc.next(), word3 = sc.next();
//        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);
//
//        System.out.println("Enter a sentence:");
//        String userSentence = sc.nextLine();
//        System.out.printf("Sentence: %s", userSentence);
//
//        System.out.println("Enter the length of your classroom in feet:");
//        double length = Double.parseDouble(sc.nextLine());
//        System.out.println("Enter the width of your classroom in feet:");
//        double width = Double.parseDouble(sc.nextLine());
//        System.out.println("Enter the height of your room in feet:");
//        double height = Double.parseDouble(sc.nextLine());
//        int perimeter = Integer.parseInt(length) * 2 + Integer.parseInt(width) * 2;
//        double perimeter = width * 2 + length * 2;
//        double volume = width * height * length;
//        System.out.printf("The perimeter of your classroom is %.2f square feet%n", perimeter);
//        System.out.printf("The volume of your classroom is %.2f cubic feet%n", volume);
//
//        System.out.println("Enter the width of your classroom in feet:");
//        int width = sc.nextInt();
//        System.out.println("Enter the length of your classroom in feet:");
//        int length = sc.nextInt();
//        System.out.printf("The perimeter of your classroom is %d%n", width* 2 + length* 2);
//        String sentence = sc.nextLine();
//        System.out.println(sentence);
//    }
//
//}