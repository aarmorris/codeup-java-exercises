public class Fighter {
    // Instance variables
    // set to private
    private String name;
    private int hitPoints;
    // setter -- set to public
    public void setHitPoints(int hitPoints){
        // if (hitPoints > 0) {.. set hitpoints}
        this.hitPoints = hitPoints;
    }

    // getter -- set to public

    public int getHitPoints(){
        return hitPoints;
    }
    public int maxDamage;
    // Instance Methods
    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints,maxDamage);
    }

    public void battleRoar(){
        System.out.printf("I am %s and I will destroy you%n", name);
    }

    public int attackRoll(){
        return D20.rollD20();
    }
    // No-arg constructor
    public Fighter(){

    }

    public Fighter(String name, int hitPoints, int maxDamage)
}
