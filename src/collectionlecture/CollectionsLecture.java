package collectionlecture;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsLecture {
    public static void main(String[] args) {
        // Create an empty arraylist
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        // Comparison
       Monster orc = new Monster(13, 15, 9, "Orc");
       Monster ogre = new Monster(11, 59, 13, "Ogre");
       Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
       Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");
       Monster goblin = new Monster(15, 7, 5, "Goblin");
       Monster werewolf = new Monster(11, 58, 7, "Werewolf" );
       // Add objects to an arrayList one at a time with .add()
       monsterArrayList.add(orc);
       // Get the size of the arrayList using .size()
        // Arrays use .length, arrayLists use .size()
       monsterArrayList.add(ogre);
        System.out.println(monsterArrayList.size());
        // access the elements of the arrayList using .get() with the index
//        System.out.println(monsterArrayList.get(0).getName());
//        System.out.println(monsterArrayList.get(1).getArmorClass());
        // How to add multiple objects to an arrayList all at once
        System.out.println(monsterArrayList);
        // How to add multiple objects to an arrayList all at once.
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));
//        System.out.println(newMonsterList.get(1));
//        System.out.println(newMonsterList.get(1).getHitPoints());
        // We can add all the elements of one araryList into another arrayList
        // using the .addALl method
//        monsterArrayList.addAll(newMonsterList);
        // If I want to add a bunch of stuff to an existing arraylist all at once.
        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));
        System.out.println(monsterArrayList);

        // Loop over arrayLists
        // traditional for loop
        for(int i = 0; i < monsterArrayList.size(); i++) {
            if (i == monsterArrayList.size() - 1) {
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
                System.out.printf("%s, ", monsterArrayList.get(i));
            }
        }

        // Enhanced for loop
        // Simpler syntax but no access to the index
        for (Monster monster : monsterArrayList ){
            System.out.println(monster.getHitPoints());
        }
        // When creating an Array List of primitive data types, use the corresponding Object wrapper. ArrayLists can only contain objects.
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1, 8, 5, 2, 9, 34, -67, 98, 24 ));
        System.out.println(myNumbers);
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
        ArrayList<String> randomWords = new ArrayList<>(List.of("dress", "chart", "hypothesize", "needle", "TRUE", "lounge"));
        System.out.println(randomWords);
        Collections.sort(randomWords);
        // In addition, the List interface contains a default method called .sort(),
        // SO you can call .sort on any ArrayList. It takes a comparator as its argument
        // You can pass it Collections.reversOrder() to sort an arraylist of strings
        //or numbers in reverse order
        randomWords.sort(Collections.reverseOrder());
        System.out.println(randomWords);
        // If you want to compare custom objects rather than numbers or strings,
        // A simple method is to call .sort() on the list and pass it
        // Comparator.comparing(NameOfObject::getterForWhatYouWantToCompare)
        // so to compare monsters by hit points, I use Monster::getHitPoints
        monsterArrayList.sort(Comparator.comparing(Monster :: getHitPoints));
        System.out.println(monsterArrayList);

        //If you want to sort custom objects by properties in reverse order, it's
        //a little more complex. One tecnique is to implement Comparator in the class
        //and override the compare() method (see code in Monster class)

        // To use the compare() method that we wrote in the Monster class, we use
        // the sort method and pass it a no-arg constructor

        monsterArrayList.sort(new Monster());
        System.out.println(monsterArrayList);



    }// end of main method
}// end of CollectionsLecture class
