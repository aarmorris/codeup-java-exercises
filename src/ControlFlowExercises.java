import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//             This is the syntax for a while loop using Java
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
        // This is the syntax for do-while loops using Java
//            int j = 0;
//        do {
//            System.out.println("I am incrementing by two " + j);
//            j += 2;
//
//        } while(j <= 100);

//        int k = 100;
//        do {
//            System.out.println("I am decrementing from 100 " + k);
//            k -= 5;
//        } while (k >= -10);
//
//        long l = 2;
//        do{
//            System.out.println("I am squaring each number " + l);
//            l = l * l;
//        } while (l < 1000000);

        // Refactoring to for loop from while loop
//        for(int z = 5; z <= 15; z++) {
//            System.out.println(z);
//            if(z == 15) {
//               break;
//            }
//        }

//        for(int m = 0; m <= 100; m+=2){
//            System.out.println(m);
//            if(m == 100) {
//                break;
//            }
//
//        }

//        for(int g = 100; g >= -10; g-=5){
//            System.out.println(g);
//            if(g == -10){
//                break;
//            }
//        }
//
//        for(long b = 2; b <=1000000; b=b*b){
//            System.out.println(b);
//            if(b == 1000000){
//                break;
//            }
//        }


//            for(int q = 1; q <= 100; q++){
//                if(((q % 3) == 0) && ((q % 5) == 0))
//                    System.out.println("fizzbuzz");
//                else if ((q % 3) == 0)
//                    System.out.println("fizz");
//                else if ((q % 5) == 0)
//                    System.out.println("buzz");
//                else
//                    System.out.println(q);
//            }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter an Integer: ");
//        int integerNext = sc.nextInt();
//
//        System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//        System.out.println("======" + "  " + "======" + "  " + "======");
//
//        for(int w = 1; w <= integerNext; w++) {
//            w = integerNext;
//            int numberSquared = (int) Math.pow(w, 2);
//            int numberCubed = (int) Math.pow(w, 3);
//
//            String message = "\n" + w + "       " + numberSquared + "       " + numberCubed;
//
//            System.out.println(message);
//            System.out.println();
//
//        }



        System.out.println("Enter a numerical grade from 0 to 100:");
        Scanner sc = new Scanner(System.in);
        byte grade = sc.nextByte();
        char letterGrade;
        if (grade >= 0 && grade <= 59){
            letterGrade = 'F';
        } else if (grade > 59 && grade <= 66){
            letterGrade = 'D';
        } else if (grade > 66 && grade <= 79) {
            letterGrade = 'C';
        } else if (grade > 79 && grade <= 87){
            letterGrade = 'B';
        } else {
            letterGrade = 'A';
        }
        System.out.println("The letter grade is " + letterGrade);

        }
}