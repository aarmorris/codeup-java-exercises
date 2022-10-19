public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello %s", this.name);
    }

    public Person(){}

    public Person(String name){
        this.name = name;
    }

}

