import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person newPerson, Person[] PeopleArray){
            Person[] newPersonArray;
            newPersonArray = new Person[PeopleArray.length +1];
            for (int i = 0; i <= PeopleArray.length; i++){
                newPersonArray[i] = PeopleArray[i];

            }
            System.out.println(Arrays.toString(newPersonArray));
            newPersonArray[newPersonArray.length-1] = newPerson;
            return newPersonArray;
    }

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person obj [];

        obj = new Person[3];

        obj[0] = new Person("Curtis");
        obj[1] = new Person("Jackson");
        obj[2] = new Person("Kanye");


        for(Person name : obj){
            System.out.println(name.getName());
        }
        ServerNameGenerator server1 = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        System.out.println(server1.getName());

    }
}

