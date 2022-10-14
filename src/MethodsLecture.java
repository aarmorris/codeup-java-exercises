public class MethodsLecture {

    public static void bark(){
        System.out.println("Woof woof!");
    }


    public static void bark(int weight){
        if (weight < 25){
            System.out.println("Yip yip");
        } else {
            System.out.println("Woof woof");
        }
    }

    public static void bark(int weight, String name){

        System.out.printf("%s goes ", name);
        bark(weight);
        String output = name + " goes ";
        if (weight < 25){
            output += "yip yip";
        } else {
            output += "woof woof";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        bark();
        bark(15);
        bark(50);
        bark(50, "Rudo");
        bark(15, "Fido");


    }
}

