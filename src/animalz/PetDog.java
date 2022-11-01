package animalz;
//
//
//


//        10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//        11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//        12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//        12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
//}

    //6. Create a PetDog class that inherits from Pet.
public class PetDog extends Pet implements Companion {
    @Override
    public String snuggle(){
//        System.out.println(super.name + " wants to snuggle");
        return super.name + " wants to snuggle";
    }
    //    7. In PetDog, create a boolean instance variable, trained.
    private boolean trained; // This is a property aka instance variable.

    //        8. Write a constructor for PetDog that sets its name, type, and trained properties.
    public PetDog(String name, String type, boolean trained){
        this.trained = trained;
        super.name = name;
        super.type = type;
    }
    //        9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
    public boolean isTrained(){
        return this.trained;

    }

    public PetDog(){};

}
