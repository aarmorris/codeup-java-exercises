package collectionlecture;

import java.sql.Array;
import java.util.ArrayList;

public class CollectionsLecture {
    public static void main(String[] args) {

        ArrayList<Monster> monsterArrayList = new ArrayList<>();
       Monster orc = new Monster(13, 15, 9, "Orc");
       Monster ogre = new Monster(11, 59, 13, "Ogre");
       monsterArrayList.add(orc);
       monsterArrayList.add(ogre);
        System.out.println(monsterArrayList.size());
        System.out.println(monsterArrayList.get(0).getName());

    }
}
