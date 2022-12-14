package animalz;

import java.util.ArrayList;
import java.util.List;

//        4. Create a class called Pet with two String instance variables, name and type.
//        5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
//        6. Create a PetDog class that inherits from Pet.
//        7. In PetDog, create a boolean instance variable, trained.
//        8. Write a constructor for PetDog that sets its name, type, and trained properties.
//        9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
//        10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//        11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//        12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//        12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
public class Practice {


    public static double average(int[] number){
        int total = 0;
        for (int i = 0; i < number.length; i++){
        total += number[i];

        }
        return (double) total/number.length;
    }
    // Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
    public static int subtractTen(int number){
        return number - 10;
    }
    //        12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
    public static ArrayList<Integer> multiplyAll(int num, ArrayList<Integer> arrayList){
        ArrayList<Integer> multiplynums = new ArrayList<>();
        for(int multinumbers : arrayList){
            multiplynums.add(multinumbers * num);
        }
        return multiplynums;
    }
            //Create a class called Practice with a main method.

    //Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double
    public static void main(String[] args) {
        int[] testArray = {5, 10, 20, 44};
//        ArrayList<Integer> testArr = new ArrayList<>(List.of(6,6,3,2,5,7,8,9,6,3,));
        System.out.println(subtractTen(20));
        System.out.println(average(testArray));
        PetDog candy = new PetDog("Kitty", "Bulldog", true);
        System.out.println(candy.getName() +" " + candy.getType() + candy.isTrained());
        System.out.println(candy.snuggle());
        System.out.println(multiplyAll(2, new ArrayList<>(List.of(6,6,3,2,5,7,8,9,6,3))));
    }
}

