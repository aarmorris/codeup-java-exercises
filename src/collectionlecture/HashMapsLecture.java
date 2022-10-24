package collectionlecture;

import java.util.*;

import static java.util.Map.entry;

public class HashMapsLecture {
    public static void main(String[] args) {
        // Create monster objects
        Monster orc = new Monster(13, 15, 9, "Orc");
        Monster ogre = new Monster(11, 59, 13, "Ogre");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138, 25, "Frost Giant");
        Monster goblin = new Monster(15, 7, 5, "Goblin");
        Monster werewolf = new Monster(11, 58, 7, "Werewolf" );
        Monster orcWarChief = new Monster(16, 93, 15, "Orc War Chief");

        // Create a new HashMap defining the key value
        // data types between angle brackets

        HashMap<String, Monster> monsterHashMap = new HashMap<>();

        // Add a Key-value pair to the hashmap using .put()

        monsterHashMap.put("orc", orc);
        // Access a value in the hashmap using .get()
        // with the key
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // Replace a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());
        // To add multiple objects to a hashmap at once
        // use Map.ofEntries
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("ogre", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );
        monsterHashMap.putAll(intermediateMap);

        // Looping Over HashMaps. Technique 1:
        // use .entrySet to derive a set of entries
        // Each entry is represented as a Map.Entry<DataTypeOfKey, DataTypeOfValue>
        // Once you have an entrySet you can use an enhanced for loop to loop over it

        for(Map.Entry< String, Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }



        // To create a list of specific properties in the objects
        // stored as HashMap values, we can use .KeySet().stream().toList()

        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
        // Once I've got a list, I can sort it and do other list things to it
        Collections.sort(monsterNames);
        System.out.println(monsterNames);

        //The strings generated from the keyset are the keys to the HashMap
        // So looping over this list allows me to access all the HashMap entries

        // Technique 2:
        for (String monsterName : monsterNames){
            Monster monster = monsterHashMap.get(monsterName);
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        // Technique 3: the forEach loop
        System.out.println("Foreach loop");
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        // convert to a TreeMap to sort by key
        System.out.println("Output of the forEach over the TreeMap");
        Map<String, Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });



    }// end of main method
}// end of class
