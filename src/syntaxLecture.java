import java.sql.SQLOutput;

public class syntaxLecture {
    public static void main(String[] args) {
            // Declare variable without intializing
            int weight;
            String breed;
            // Initializing after declaration
            weight = 12;
            breed = "Cavalier King Charles Spaniel";
            // Initialize and declare at the same time
            String name = "Grinch";
            int cutenessFactor = 10;
            // Statement: "JVM, do something"
            System.out.println(name + " is a " + breed + ".");
            // Conditional logic
            if (cutenessFactor > 8){
                System.out.println(name + " is cute.");
            } else {
                System.out.println(name + " needs to work on cuteness.");
            }

            boolean isGrinchCute = true;
            char oneLetter = 'a';
            byte smallNumber; //bytes go from -128 to 127
            short mediumNumber; // shorts go from -32768 to 32767
            int number; // integers go c. -2 billion to 2 billion
            long bigNumber; // longs go about -9 quadrillion to 9 quadrillion


            float imafloat = 2.34F;
            double imadouble = 9.0123456780123;
            System.out.println(imadouble);
            imafloat = (float) imadouble;
            System.out.println(imafloat);

            int myFavoriteNumber = 8;
            System.out.println(myFavoriteNumber);

            String myString = "I miss my grandmother";
            System.out.println(myString +" 3.14159");

            double myNumber = 3.14;
            System.out.println(myNumber);

            int x = 5;
            System.out.println(++x);
            System.out.println(x);

            String theNumberThree = "three";
            Object o = theNumberThree;
            int three = (int) o;





    }
}
