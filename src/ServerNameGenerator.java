import java.util.Random;

public class ServerNameGenerator {
    String[] adjectives = {};
    String[] nouns = {};

    private String name;
    public String getName(){
        return name;
    }
    public static String getRandomElement(String[] array) {
        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        return array[randomIndex];
    }

    public ServerNameGenerator(){
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String combined = adjective + "_" + noun;
        this.name = combined;
    }
}
